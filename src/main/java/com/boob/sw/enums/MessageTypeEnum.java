package com.boob.sw.enums;

public enum MessageTypeEnum {

    ERROR_MESSAGE(1, "errorMessage"),
    SUCCESS_MESSAGE(2, "successMessage"),
    WARN_MESSAGE(3, "warnMessage"),
    HAVE_MESSAGE(4, "haveMessage"),
    ;

    private Integer code;
    private String type;

    MessageTypeEnum(Integer code, String type) {
        this.code = code;
        this.type = type;
    }

    public Integer getCode() {
        return code;
    }

    public String getType() {
        return type;
    }
}
