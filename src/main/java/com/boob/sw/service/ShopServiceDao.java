package com.boob.sw.service;

import com.boob.sw.dto.CartDto;
import com.boob.sw.dto.ShopDto;
import com.boob.sw.model.Cart;

public interface ShopServiceDao {

    /**
     * 根据页面数获取商品信息
     *
     * @param page
     * @return
     */
    ShopDto getAll(Integer page);


    /**
     * 加入购物车
     *
     * @param cart
     * @return
     */
    boolean addCart(Cart cart);


    /**
     * 获取购物车
     *
     * @param uId
     * @return
     */
    CartDto getCart(Long uId);

    /**
     * 根据id删除cart
     *
     * @param cartId
     * @return
     */
    boolean deleteCart(Long cartId);
}
