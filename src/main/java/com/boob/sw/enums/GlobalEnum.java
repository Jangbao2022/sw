package com.boob.sw.enums;

public enum GlobalEnum implements IMessageEnum {

    //全局错误提示
    NOT_SUPPORT(100, "暂不支持该功能"),
    PLEASE_LOGIN(101, "请先登录"),

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
