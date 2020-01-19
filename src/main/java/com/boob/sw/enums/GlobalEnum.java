package com.boob.sw.enums;

/**
 * 全局提示信息
 */
public enum GlobalEnum implements IMessageEnum {

    //错误提示
    NOT_SUPPORT(100, "暂不支持该功能"),
    PLEASE_LOGIN(101, "请先登录"),

    //警告提示
    IS_EMPTY(300, "这里空空如也呢"),

    //blog中的提示
    BLOG_IS_EMPTY(301, "该文章不存在了"),


    ;


    private Integer code;

    private String message;

    GlobalEnum(Integer code, String message) {
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
