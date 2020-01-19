package com.boob.sw.dto;

import com.boob.sw.enums.PageUrlEnum;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 封装页面类
 * blogs 大神(复数) 等等
 *
 * @param <E>
 */
@Data
@Component
public class PagesDto<E> {

    //当前页面要跳转的url前串
    private String PAGE_URL;
    //每一页四个blog
    private final Integer CONTAINS = 4;
    //elements列表
    private List<E> elements;
    //总页数
    private Integer totalPage;
    //当前页
    private Integer page;
    //前一页
    private String prePageUrl;
    //后一页
    private String aftPageUrl;

    //构造方法
    public PagesDto() {

    }

    //构造方法重载
    public PagesDto(String pageUrl) {
        //注入url
        this.PAGE_URL = pageUrl;
    }

    /**
     * 设置totalPage数量
     *
     * @param total 有多少个elements
     */
    public void countTotalPage(Integer total) {
        if (total % CONTAINS == 0) {
            totalPage = total / CONTAINS;
        } else {
            totalPage = total / CONTAINS + 1;
        }
    }

    /**
     * 计算当前页,前页和后页
     *
     * @param page
     */
    public void countPreAndAfter(Integer page) {

        //如果总共只有一页
        if (totalPage <= 1) {
            this.page = 1;
            prePageUrl = PageUrlEnum.PAGE_STATIC.getUrl();
            aftPageUrl = PageUrlEnum.PAGE_STATIC.getUrl();
            return;
        }

        if (page <= 1) {
            //如果当前页小于等于第一页
            this.page = 1;
            prePageUrl = PageUrlEnum.PAGE_STATIC.getUrl();
            aftPageUrl = PAGE_URL + page;

        } else if (page >= totalPage) {
            //如果当前页大于等于最后一页
            this.page = totalPage;
            prePageUrl = PAGE_URL + (page - 1);
            aftPageUrl = PageUrlEnum.PAGE_STATIC.getUrl();
        } else {
            //当前页在中间
            this.page = page;
            prePageUrl = PAGE_URL + (page - 1);
            aftPageUrl = PAGE_URL + (page + 1);
        }
    }


}
