package com.boob.sw.controller;

import com.boob.sw.enums.GlobalEnum;
import com.boob.sw.enums.UserEnum;
import com.boob.sw.model.User;
import com.boob.sw.service.UserServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String login(@RequestParam("account") Long account,
                        @RequestParam("password") String password,
                        HttpServletRequest request,
                        HttpServletResponse response,
                        Model model) {
        //封装传入数据
        User preUser = new User();
        preUser.setAccount(account);
        preUser.setPassword(password);
        //检查用户合法性
        User user = userServiceDao.checkUser(preUser);
        //如果不存在
        if (user == null) {
            //添加错误信息
            model.addAttribute("account", account);
            model.addAttribute("password", password);
            model.addAttribute("errorMessage", UserEnum.USER_ACCOUNT_FALSE.getMessage());
            return "account/login";
        } else {
            //登录
            userServiceDao.login(user, request, response);

            //成功返回index
            return "redirect:/index";
        }
    }

    @PostMapping("register")
    public String registry(@RequestParam("username") String username,
                           @RequestParam("account") Long account,
                           @RequestParam("email") String email,
                           @RequestParam("password") String password,
                           Model model
    ) {
        //封装传入数据
        User user = new User();
        user.setAccount(account);
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);

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
    public String forgetPassword(@RequestParam("email") String email,
                                 Model model) {

        User user = new User();
        user.setEmail(email);
        model.addAttribute("user", user);
        model.addAttribute("errorMessage", GlobalEnum.NOT_SUPPORT.getMessage());
        return "account/forgetPassword";
    }
}
