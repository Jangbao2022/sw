package com.boob.sw.enums;

/**
 * 页面跳转枚举
 */
public enum PageUrlEnum {

    ARTICLE_PAGE("文章页面分页", "/article/blogs?page="),


    PAGE_STATIC("页面不变", "#"),


    ;

    private String describe;
    private String url;

    PageUrlEnum(String describe, String url) {
        this.describe = describe;
        this.url = url;
    }

    public String getDescribe() {
        return describe;
    }

    public String getUrl() {
        return url;
    }
}
