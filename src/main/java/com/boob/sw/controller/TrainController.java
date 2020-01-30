package com.boob.sw.controller;

import com.boob.sw.enums.GlobalEnum;
import com.boob.sw.enums.MessageTypeEnum;
import com.boob.sw.model.Target;
import com.boob.sw.model.Today;
import com.boob.sw.model.User;
import com.boob.sw.service.TargetServiceDao;
import com.boob.sw.service.TodayServiceDao;
import com.boob.sw.utils.MessageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 今日训练controller
 */
@Controller
@RequestMapping("/train")
public class TrainController {


    @Autowired
    private TodayServiceDao todayServiceDao;

    @Autowired
    private TargetServiceDao targetServiceDao;

    @GetMapping("today")
    public String getToday(HttpServletRequest request,
                           Model model) {

        User user = (User) request.getSession().getAttribute("user");
        Today today = todayServiceDao.getTodayByUid(user.getId());

        model.addAttribute("today", today);
        return "train/today";
    }

    @PostMapping("today")
    public String changeToday(HttpServletRequest request,
                              Today today,
                              Model model) {

        User user = (User) request.getSession().getAttribute("user");
        today.setuId(user.getId());
        boolean b = todayServiceDao.changeToday(today);
        //消息通知
        MessageUtils.addMessage(b, model);
        return "redirect:/train/today";

    }


    @GetMapping("target")
    public String getTarget(HttpServletRequest request,
                            Model model) {

        User user = (User) request.getSession().getAttribute("user");
        Target target = targetServiceDao.getTargetByUid(user.getId());

        model.addAttribute("target", target);
        return "train/target";
    }

    @PostMapping("target")
    public String changeTarget(HttpServletRequest request,
                               Target target,
                               Model model) {

        User user = (User) request.getSession().getAttribute("user");
        target.setuId(user.getId());
        boolean b = targetServiceDao.changeTarget(target);
        //消息通知
        MessageUtils.addMessage(b, model);
        return "redirect:/train/target";

    }


}
