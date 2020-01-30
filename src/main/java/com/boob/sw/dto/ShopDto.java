package com.boob.sw.dto;

import com.boob.sw.model.Goods;
import lombok.Data;

import java.util.List;

/**
 * 封装商品页面
 */
@Data
public class ShopDto {

    List<Goods> goodsList;

}
