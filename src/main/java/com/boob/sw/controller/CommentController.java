package com.boob.sw.controller;

import com.boob.sw.enums.GlobalEnum;
import com.boob.sw.enums.PageUrlEnum;
import com.boob.sw.model.BlogComment;
import com.boob.sw.model.User;
import com.boob.sw.service.BlogCommentServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * 处理提交评论
 */
@Controller
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private BlogCommentServiceDao blogCommentServiceDao;

    //处理blog下提交的评论
    @PostMapping("blogComment")
    public String blogComment(BlogComment blogComment,
                              @RequestParam("blogId") Long blogId,
                              HttpServletRequest request,
                              Model model) {


        //通过后台获取可以防止表单伪造
        User user = (User) request.getSession().getAttribute("user");

        //获取检验结果
        boolean flag = blogCommentServiceDao.checkComment(blogComment, user);

        if (flag && blogCommentServiceDao.uploadComment(blogComment)) {
            //评论成功
            model.addAttribute("successMessage", GlobalEnum.COMMENT_SUCCESS.getMessage());
        } else {
            //评论失败
            model.addAttribute("errorMessage", GlobalEnum.COMMENT_FAIL);
        }

        //重定向到文章
        return "redirect:" + PageUrlEnum.ARTICLE_BLOG.getUrl() + blogId;
    }

}
