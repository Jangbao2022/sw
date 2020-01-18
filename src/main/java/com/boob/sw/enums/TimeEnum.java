package com.boob.sw.enums;

import java.sql.Time;

public enum TimeEnum {

    ONE_DAY(1, 60 * 60 * 24),
    THREE_DAY(2, 60 * 60 * 24 * 3),
    ONE_MONTH(3, 60 * 60 * 24 * 30),
    ;

    private Integer code;
    private Integer time;

    TimeEnum(Integer code, Integer time) {
        this.code = code;
        this.time = time;
    }

    public Integer getCode() {
        return code;
    }

    public Integer getTime() {
        return time;
    }
}
