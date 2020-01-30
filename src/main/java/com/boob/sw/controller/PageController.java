package com.boob.sw.controller;

import com.boob.sw.dto.MessageDto;
import com.boob.sw.enums.MessageTypeEnum;
import com.boob.sw.enums.UserEnum;
import com.boob.sw.model.User;
import com.boob.sw.service.UserServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 页面跳转处理 需要在跳转之前做一些操作
 */
@Controller
@RequestMapping("/page")
public class PageController {

    @Autowired
    private UserServiceDao userServiceDao;

    /**
     * 登录页面
     *
     * @return
     */
    @GetMapping("login")
    public String login(HttpServletRequest request,
                        Model model) {


        //是否存在提示信息
        boolean haveMessage = false;
        //检查session域中有没有用户
        boolean b = userServiceDao.checkLogin(request, null);
        //如果已登录
        if (b) {
            //提示信息置为存在
            haveMessage = true;
            model.addAttribute(MessageTypeEnum.WARN_MESSAGE.getType(), UserEnum.USER_ALREAD_LOGIN.getMessage());

            model.addAttribute(MessageTypeEnum.HAVE_MESSAGE.getType(), haveMessage);
            return "index";
        }
        model.addAttribute(MessageTypeEnum.HAVE_MESSAGE.getType(), haveMessage);
        return "account/login";
    }

    /**
     * index页面
     *
     * @return
     */
    @GetMapping("index")
    public String index(HttpServletRequest request) {

        //获取用户
        User user = (User) request.getSession().getAttribute("user");

        //获取消息数
        MessageDto messageDto = userServiceDao.putMessageCount(user.getId());

        //重置消息数
        request.getSession().setAttribute("messageDto", messageDto);

        return "index";
    }


}
