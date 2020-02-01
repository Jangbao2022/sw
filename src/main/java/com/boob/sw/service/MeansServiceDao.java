package com.boob.sw.service;

import com.boob.sw.dto.PagesDto;
import com.boob.sw.model.Photo;

/**
 * 获取资源service层
 */
public interface MeansServiceDao {

    /**
     * 获取musicPage
     *
     * @param page
     * @return
     */
    PagesDto getAllMusic(Integer page);


    /**
     * 获取photoPage
     *
     * @param page
     * @return
     */
    PagesDto<Photo> getAllPhoto(Integer page);
}
