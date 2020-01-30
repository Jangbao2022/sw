package com.boob.sw.dto;

import com.boob.sw.model.exp.GoodExp;
import lombok.Data;

import java.util.List;

/**
 * 购物车封装类
 */
@Data
public class CartDto {

    private List<GoodExp> goodExps;
    private Double oldTotalPrice;//总原价
    private Double save;//省钱
    private Double newTotalPrice;//折后价
}
