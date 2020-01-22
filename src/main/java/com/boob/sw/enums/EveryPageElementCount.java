package com.boob.sw.enums;

public enum EveryPageElementCount {

    BLOGS(4, "blogs页面"),
    SEND_US(3, "sendUs页面"),
    ;

    private Integer count;
    private String page;

    EveryPageElementCount(Integer count, String page) {
        this.count = count;
        this.page = page;
    }

    public Integer getCount() {
        return count;
    }

    public String getPage() {
        return page;
    }
}
