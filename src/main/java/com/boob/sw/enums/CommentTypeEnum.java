package com.boob.sw.enums;

public enum CommentTypeEnum {


    COMMENT_MAJOR(1, "一级评论"),
    COMMENT_COMMENT(2, "二级评论");

    private Integer type;
    private String describe;

    CommentTypeEnum(Integer type, String describe) {
        this.type = type;
        this.describe = describe;
    }

    public Integer getType() {
        return type;
    }

    public String getDescribe() {
        return describe;
    }
}
