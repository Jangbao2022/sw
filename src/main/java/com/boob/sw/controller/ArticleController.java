package com.boob.sw.controller;

import com.boob.sw.dto.BlogDto;
import com.boob.sw.dto.PagesDto;
import com.boob.sw.enums.GlobalEnum;
import com.boob.sw.enums.MessageTypeEnum;
import com.boob.sw.service.BlogServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 处理文章
 */
@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private BlogServiceDao blogServiceDao;


    /**
     * 获取所有文章
     *
     * @param page
     * @param model
     * @return
     */
    @GetMapping("blogs")
    public String getBlogs(@RequestParam(value = "page", required = false) String page,
                           Model model) {

        //是否存在提示信息
        boolean haveMessage = false;
        //获取页面要的数据
        PagesDto blogsDto = blogServiceDao.getPages(page);
        if (blogsDto.getElements().isEmpty()) {

            model.addAttribute("isEmpty", GlobalEnum.IS_EMPTY.getMessage());
        }

        model.addAttribute(MessageTypeEnum.HAVE_MESSAGE.getType(), haveMessage);
        //将数据加入页面
        model.addAttribute("blogsDto", blogsDto);
        return "article/blogs";
    }

    /**
     * 获取单篇文章细节
     *
     * @param blogId
     * @param model
     * @return
     */
    @GetMapping("blog")
    public String getBlog(@RequestParam("blogId") String blogId,
                          Model model) {
        //是否存在提示信息
        boolean haveMessage = false;
        //获取页面要的数据
        BlogDto blogDto = blogServiceDao.getPage(blogId);
        if (blogDto.getBlog() == null) {
            //提示信息置为存在
            haveMessage = true;
            model.addAttribute(MessageTypeEnum.WARN_MESSAGE.getType(), GlobalEnum.BLOG_IS_EMPTY.getMessage());
        } else {
            //将数据加入页面
            model.addAttribute("blogDto", blogDto);
        }
        model.addAttribute(MessageTypeEnum.HAVE_MESSAGE.getType(), haveMessage);
        return "article/blog";

    }

}
