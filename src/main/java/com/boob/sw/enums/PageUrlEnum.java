package com.boob.sw.enums;

/**
 * 页面跳转枚举
 */
public enum PageUrlEnum {

    ARTICLE_BLOGS_PAGE("文章页面分页", "/article/blogs?page="),
    US_SEND_US_PAGE("sendUs分页页面", "/us/sendUses?page="),

    ARTICLE_BLOG("文章页面", "/article/blog?blogId="),

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
