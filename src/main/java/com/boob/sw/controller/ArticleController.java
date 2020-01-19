package com.boob.sw.controller;

import com.boob.sw.dto.BlogDto;
import com.boob.sw.dto.PagesDto;
import com.boob.sw.enums.GlobalEnum;
import com.boob.sw.service.BlogServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private BlogServiceDao blogServiceDao;


    @GetMapping("blogs")
    public String getBlogs(@RequestParam(value = "page", required = false) String page,
                           Model model) {

        //获取页面要的数据
        PagesDto blogsDto = blogServiceDao.getPages(page);
        if (blogsDto.getElements().isEmpty()) {
            model.addAttribute("warnMessage", GlobalEnum.IS_EMPTY.getMessage());
        }

        //将数据加入页面
        model.addAttribute("blogsDto", blogsDto);
        return "article/blogs";
    }

    @GetMapping("blog")
    public String getBlog(@RequestParam("blogId") String blogId,
                          Model model) {
        //获取页面要的数据
        BlogDto blogDto = blogServiceDao.getPage(blogId);
        if (blogDto.getBlog() == null) {
            model.addAttribute("warnMessage", GlobalEnum.BLOG_IS_EMPTY.getMessage());
        } else {
            //将数据加入页面
            model.addAttribute("blogDto", blogDto);
        }
        return "article/blog";

    }

}
