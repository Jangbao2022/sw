package com.boob.sw.enums;

/**
 * 时间枚举
 * 方便管理
 */
public enum TimeEnum {

    COOKIE_LIFE("cookie生命长度", 60 * 60 * 24),

    ONE_DAY("一天的毫秒数", 1000 * 60 * 60 * 24);

    private String describe;
    private Integer time;

    TimeEnum(String describe, Integer time) {
        this.describe = describe;
        this.time = time;
    }

    public String getDescribe() {
        return describe;
    }

    public Integer getTime() {
        return time;
    }
}
