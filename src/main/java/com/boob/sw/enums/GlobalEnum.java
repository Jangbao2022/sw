package com.boob.sw.enums;

/**
 * 全局提示信息
 */
public enum GlobalEnum implements IMessageEnum {

    //错误提示
    NOT_SUPPORT(100, "暂不支持该功能"),
    PLEASE_LOGIN(101, "请先登录"),

    //普通提示
    IS_EMPTY(300, "这里空空如也呢"),

    //操作成功
    OPERATE_SUCCESS(200, "操作成功"),

    //操作失败
    OPERATE_FAIL(400, "操作失败"),

    //评论失败
    COMMENT_FAIL(420, "评论失败,被评论物或许已经不存在了"),

    //blog中的提示
    BLOG_IS_EMPTY(301, "该文章不存在了"),

    //评论成功提示
    COMMENT_SUCCESS(220, "评论成功"),

    //权限不够
    POWER_NOT_ENOUGH(440, "你的权限不够"),
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
