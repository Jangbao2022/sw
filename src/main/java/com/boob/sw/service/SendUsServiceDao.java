package com.boob.sw.service;

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
     * @return
     */
    List<SendUs> getAllSendUs();

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
