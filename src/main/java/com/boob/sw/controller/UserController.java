package com.boob.sw.controller;

import com.boob.sw.enums.GlobalEnum;
import com.boob.sw.enums.UserEnum;
import com.boob.sw.model.User;
import com.boob.sw.service.UserServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 用户控制类
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceDao userServiceDao;

    /**
     * 登录重新:
     * 成功返回主页
     * 失败返回登录页面
     *
     * @return
     */
    @PostMapping("login")
    public String login(User user,
                        HttpServletRequest request,
                        HttpServletResponse response,
                        Model model) {

        //检查用户合法性
        User checkUser = userServiceDao.checkUser(user);
        //如果不存在
        if (checkUser == null) {
            //添加错误信息
            model.addAttribute("account", user.getAccount());
            model.addAttribute("password", user.getPassword());
            model.addAttribute("errorMessage", UserEnum.USER_ACCOUNT_FALSE.getMessage());
            return "account/login";
        } else {
            //登录
            userServiceDao.login(checkUser, request, response);

            //成功返回index
            return "redirect:/index";
        }
    }

    /**
     * 注册账号
     *
     * @param user
     * @param model
     * @return
     */
    @PostMapping("register")
    public String registry(User user,
                           Model model
    ) {

        //注册检验
        User registerUser = userServiceDao.checkRegister(user);

        //检验成功
        if (registerUser != null) {
            //注册
            boolean b = userServiceDao.register(user);
            if (b) {
                //注册成功
                model.addAttribute("successMessage", UserEnum.USER_ACCOUNT_REGISTER_SUCCESS.getMessage());
            } else {
                //注册失败
                model.addAttribute("errorMessage", UserEnum.USER_ACCOUNT_REGISTER_FAIL.getMessage());
            }
        } else {
            model.addAttribute("user", user);
            model.addAttribute("errorMessage", UserEnum.USER_ACCOUNT_EXIST.getMessage());
        }
        return "account/register";
    }

    @PostMapping("forgetPassword")
    public String forgetPassword(User user,
                                 Model model) {


        userServiceDao.forgetPassword(user);

        model.addAttribute("user", user);
        model.addAttribute("errorMessage", GlobalEnum.NOT_SUPPORT.getMessage());
        return "account/forgetPassword";
    }

    /**
     * 退出登录
     *
     * @return
     */
    @GetMapping("logon")
    public String logon(HttpServletRequest request, HttpServletResponse response, Model model) {

        //检验是否已登录
        boolean logon = userServiceDao.logon(request, response);
        return "index";
    }
}
