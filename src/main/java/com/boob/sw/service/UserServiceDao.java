package com.boob.sw.service;

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
     */
    boolean login(User user, HttpServletRequest request, HttpServletResponse response);


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

}
