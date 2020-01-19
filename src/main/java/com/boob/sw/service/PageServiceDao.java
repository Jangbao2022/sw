package com.boob.sw.service;

import com.boob.sw.dto.PageDto;
import com.boob.sw.dto.PagesDto;

/**
 * 获取pageDto接口
 * blogs, superior,....
 */
public interface PageServiceDao {


    /**
     * 通过页面获取pageDto
     * 若page格式错误 返回首页
     *
     * @param page
     * @return
     */
    PagesDto getPages(String page);

    /**
     * 检查page字符合法性
     *
     * @param page
     * @return
     */
    Integer checkPage(String page);

    /**
     * 通过id获取相应页面
     *
     * @param id
     * @return
     */
    PageDto getPage(String id);

    /**
     * 检查id字符合法性
     *
     * @param id
     * @return
     */
    Long checkId(String id);
}
