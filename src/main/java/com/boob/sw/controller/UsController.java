package com.boob.sw.controller;

import com.boob.sw.dto.PagesDto;
import com.boob.sw.enums.GlobalEnum;
import com.boob.sw.enums.MessageType;
import com.boob.sw.model.SendUs;
import com.boob.sw.model.User;
import com.boob.sw.service.SendUsServiceDao;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * us页面的控制类
 * 给我的邮件
 */
@Controller
@RequestMapping("/us")
public class UsController {

    @Autowired
    private SendUsServiceDao sendUsServiceDao;

    @PostMapping("sendUs")
    public String SendUs(SendUs sendUs,
                         HttpServletRequest request,
                         Model model) {
        User user = (User) request.getSession().getAttribute("user");

        boolean b = sendUsServiceDao.checkSendUs(sendUs, user);

        //添加message
        model.addAttribute(MessageType.HAVE_MESSAGE.getType(), true);
        if (b && sendUsServiceDao.saveSendUs(sendUs)) {
            model.addAttribute(MessageType.SUCCESS_MESSAGE.getType(), GlobalEnum.OPERATE_SUCCESS.getMessage());
        } else {
            model.addAttribute(MessageType.ERROR_MESSAGE.getType(), GlobalEnum.OPERATE_FAIL.getMessage());
        }
        return "us/contact";
    }

    @GetMapping("sendUses")
    public String getSendUs(HttpServletRequest request,
                            @RequestParam(value = "page", required = false) String page,
                            Model model) {

        User user = (User) request.getSession().getAttribute("user");
        //检验user权限
        boolean b = sendUsServiceDao.checkPower(user);

        if (b) {
            //权限足够
            PagesDto sendUsDto = sendUsServiceDao.getPages(page);
            model.addAttribute("sendUsDto", sendUsDto);
            return "us/sendUs";
        } else {
            //添加message
            model.addAttribute(MessageType.HAVE_MESSAGE.getType(), true);
            model.addAttribute(MessageType.ERROR_MESSAGE.getType(), GlobalEnum.POWER_NOT_ENOUGH.getMessage());
        }
        return "index";
    }

    @GetMapping("deleteSendUs")
    public String getSendUs(HttpServletRequest request,
                            @RequestParam("id") Long id,
                            Model model) {
        User user = (User) request.getSession().getAttribute("user");
        //检验user权限
        boolean b = sendUsServiceDao.checkPower(user);

        //添加message
        model.addAttribute(MessageType.HAVE_MESSAGE.getType(), true);
        //权限足够
        if (b) {
            //删除操作
            boolean b1 = sendUsServiceDao.delSendUs(id);
            if (b1) {
                model.addAttribute(MessageType.SUCCESS_MESSAGE.getType(), GlobalEnum.OPERATE_SUCCESS.getMessage());
            } else {
                model.addAttribute(MessageType.ERROR_MESSAGE.getType(), GlobalEnum.OPERATE_FAIL.getMessage());
            }
            return "redirect:/us/sendUses";
        } else {
            model.addAttribute(MessageType.ERROR_MESSAGE.getType(), GlobalEnum.POWER_NOT_ENOUGH.getMessage());
        }
        return "index";
    }
}
