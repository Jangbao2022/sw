package com.boob.sw.controller;

import com.boob.sw.dto.PagesDto;
import com.boob.sw.service.MeansServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 资源管理controller (video music...)
 */
@Controller
@RequestMapping("/means")
public class MeansController {


    @Autowired
    private MeansServiceDao meansServiceDao;

    /**
     * 得到music页面
     *
     * @param model
     * @return
     */
    @RequestMapping("music")
    public String music(Model model) {

        PagesDto musicDto = meansServiceDao.getAllMusic(null);
        model.addAttribute("musicDto", musicDto);
        return "means/music";
    }

    /**
     * 得到photo页面
     *
     * @param model
     * @return
     */
    @RequestMapping("photo")
    public String photo(Model model) {
        PagesDto photoDto = meansServiceDao.getAllPhoto(null);
        model.addAttribute("photoDto", photoDto);
        return "means/photo";
    }
}
