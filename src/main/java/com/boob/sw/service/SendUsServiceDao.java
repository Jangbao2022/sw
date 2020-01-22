package com.boob.sw.service;

import com.boob.sw.dto.PagesDto;
import com.boob.sw.model.SendUs;
import com.boob.sw.model.User;

import java.util.List;

/**
 * sendUs service层
 */
public interface SendUsServiceDao {

    /**
     * 检验权限
     *
     * @param user
     * @return
     */
    boolean checkPower(User user);

    /**
     * 获取所有sendUs
     *
     * @param page 页码
     * @return
     */
    PagesDto getPages(String page);

    /**
     * 检查页码合法性
     *
     * @param page
     * @return
     */
    Integer checkPage(String page);

    /**
     * 检验是不是user发的sendUs
     *
     * @param sendUs
     * @param user
     * @return
     */
    boolean checkSendUs(SendUs sendUs, User user);

    /**
     * 发送sendUs
     *
     * @param sendUs
     * @return
     */
    boolean saveSendUs(SendUs sendUs);

    /**
     * 删除sendUs
     *
     * @param sendUsId
     * @return
     */
    boolean delSendUs(Long sendUsId);


}
