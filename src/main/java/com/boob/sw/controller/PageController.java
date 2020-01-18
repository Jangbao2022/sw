package com.boob.sw.controller;

import com.boob.sw.enums.UserEnum;
import com.boob.sw.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 页面跳转处理
 */
@Controller
@RequestMapping("/page")
public class PageController {

    /**
     * 登录页面
     *
     * @return
     */
    @GetMapping("login")
    public String login(HttpServletRequest request,
                        Model model) {
        //检查session域中有没有用户
        User user = (User) request.getSession().getAttribute("user");
        //如果已登录
        if (user != null) {
            model.addAttribute("warnMessage", UserEnum.USER_ALREAD_LOGIN.getMessage());
            return "index";
        }
        return "account/login";
    }
}
