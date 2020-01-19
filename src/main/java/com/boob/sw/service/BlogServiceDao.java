package com.boob.sw.service;

import com.boob.sw.dto.BlogDto;

/**
 * blogService接口
 * 可以添加 blog表的特殊查询等等
 */
public interface BlogServiceDao extends PageServiceDao {

    /**
     * 复写父类方法 带有blog特性
     *
     * @param id
     * @return
     */
    @Override
    BlogDto getPage(String id);

}
