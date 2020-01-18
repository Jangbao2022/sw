package com.boob.sw.enums;

public enum UserEnum implements IMessageEnum {

    //错误信息
    //客户端出现的问题
    USER_ACCOUNT_FALSE(100, "用户名密码错误"),
    USER_ACCOUNT_NOT_LOGIN(101, "请先登录"),
    USER_ACCOUNT_REGISTER_FAIL(102, "注册失败,请重试"),
    USER_ACCOUNT_EXIST(103, "账号已存在,换个账号吧"),

    //服务端出现的问题
    USER_ACCOUNT_REPEAT(1000, "用户账号存在重复"),

    //成功信息
    USER_ACCOUNT_REGISTER_SUCCESS(200, "用户注册成功,去登陆吧"),

    ;

    private Integer code;

    private String message;

    UserEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
