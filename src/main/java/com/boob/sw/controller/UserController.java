package com.boob.sw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 用户类
 */
@Controller
@RequestMapping("/user")
public class UserController {



    /**
     * 登录重新:
     * 成功返回主页
     * 失败返回登录页面
     *
     * @return
     */
    @PostMapping("login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {

        System.out.println(username);
        System.out.println(password);
        return "redirect:/index";
    }


    @PostMapping("registry")
    public String registry() {

        return "redirect:index";
    }
}
