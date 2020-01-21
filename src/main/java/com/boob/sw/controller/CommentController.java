package com.boob.sw.controller;

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
                              HttpServletRequest request,
                              Model model) {

        User user = (User) request.getSession().getAttribute("user");

        //上传评论
        boolean b = blogCommentServiceDao.uploadComment(blogComment, user);


        return null;
    }

}
