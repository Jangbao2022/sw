package com.boob.sw.enums;

/**
 * 用户类型
 */
public enum UserTypeEnum {
    ORIGINAL(1, "普通用户"),
    SHOPPER(2, "商家"),
    ORGANIZATION(3, "组织"),
    ADMINISTRATOR(4, "管理员"),
    SUPER_ADMINISTRATOR(5, "超管");

    private Integer code;
    private String type;

    UserTypeEnum(Integer code, String type) {

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
