package com.boob.sw.model.exp;

import com.boob.sw.model.Goods;
import com.boob.sw.model.ShopClass;
import lombok.Data;

/**
 * 购物车中的Goods扩展
 */
@Data
public class GoodsExp {

    private Goods goods;
    private ShopClass shopClass;
    private Long cartId;
    private Integer num;
    private Double price;
}
