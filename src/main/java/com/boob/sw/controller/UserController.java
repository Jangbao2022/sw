package com.boob.sw.controller;

import com.boob.sw.dto.MessageDto;
import com.boob.sw.enums.GlobalEnum;
import com.boob.sw.enums.MessageType;
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

        //是否存在提示信息
        boolean haveMessage = false;
        //检查用户合法性
        User checkUser = userServiceDao.checkUser(user);
        //如果不存在
        if (checkUser == null) {
            //提示信息置为存在
            haveMessage = true;
            //添加错误信息
            model.addAttribute("account", user.getAccount());
            model.addAttribute("password", user.getPassword());
            model.addAttribute(MessageType.ERROR_MESSAGE.getType(), UserEnum.USER_ACCOUNT_FALSE.getMessage());

            model.addAttribute(MessageType.HAVE_MESSAGE.getType(), haveMessage);
            return "account/login";

        } else {

            //登录
            MessageDto messageDto = userServiceDao.login(checkUser, request, response);

            request.getSession().setAttribute("messageDto", messageDto);
            model.addAttribute(MessageType.HAVE_MESSAGE.getType(), haveMessage);
            //成功返回index
            return "index";
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

        //是否存在提示信息
        boolean haveMessage = false;
        //注册检验
        User registerUser = userServiceDao.checkRegister(user);
        //提示信息置为存在
        haveMessage = true;

        //检验成功
        if (registerUser != null) {

            //注册
            boolean b = userServiceDao.register(user);
            if (b) {
                //注册成功
                model.addAttribute(MessageType.SUCCESS_MESSAGE.getType(), UserEnum.USER_ACCOUNT_REGISTER_SUCCESS.getMessage());
            } else {
                //注册失败
                model.addAttribute(MessageType.ERROR_MESSAGE.getType(), UserEnum.USER_ACCOUNT_REGISTER_FAIL.getMessage());
            }
        } else {
            model.addAttribute("user", user);
            model.addAttribute(MessageType.ERROR_MESSAGE.getType(), UserEnum.USER_ACCOUNT_EXIST.getMessage());
        }
        model.addAttribute(MessageType.HAVE_MESSAGE.getType(), haveMessage);
        return "account/register";
    }

    @PostMapping("forgetPassword")
    public String forgetPassword(User user,
                                 Model model) {

        //是否存在提示信息
        boolean haveMessage = false;
        userServiceDao.forgetPassword(user);
        model.addAttribute("user", user);
        //提示信息置为存在
        haveMessage = true;

        model.addAttribute(MessageType.ERROR_MESSAGE.getType(), GlobalEnum.NOT_SUPPORT.getMessage());
        model.addAttribute(MessageType.HAVE_MESSAGE.getType(), haveMessage);
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
        userServiceDao.logon(request, response);
        return "index";
    }
}
