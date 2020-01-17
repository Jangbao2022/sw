package com.boob.sw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转处理
 */
@Controller
@RequestMapping("/page")
public class PageController {

    /**
     * 跳转登录页面
     *
     * @return
     */
    @RequestMapping("login")
    public String login() {
        return "account/login";
    }





}
