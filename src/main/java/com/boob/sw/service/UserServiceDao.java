package com.boob.sw.service;

import com.boob.sw.dto.MessageDto;
import com.boob.sw.model.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface UserServiceDao {

    /**
     * 检查用户是否在数据库中
     *
     * @param user
     * @return
     */
    User checkUser(User user);

    /**
     * 登录 将用户账号置入session域
     * 并设置权限
     *
     * @param user 账号
     * @return 消息数量
     */
    MessageDto login(User user, HttpServletRequest request, HttpServletResponse response);


    /**
     * 放置消息数量
     *
     * @param userId
     * @return 消息数量
     */
    MessageDto putMessageCount(Long userId);

    /**
     * 检验账户合法性
     *
     * @param user 账号
     * @return
     */
    User checkRegister(User user);

    /**
     * 注册
     *
     * @param user
     */
    boolean register(User user);

    /**
     * 忘记密码
     *
     * @return
     */
    boolean forgetPassword(User user);

    /**
     * 退出登录
     *
     * @return
     */
    boolean logon(HttpServletRequest request, HttpServletResponse response);


    /**
     * 检查是否已登录
     *
     * @param request
     * @return
     */
    boolean checkLogin(HttpServletRequest request, HttpServletResponse response);

}
