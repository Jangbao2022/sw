package com.boob.sw.model.exp;

import com.boob.sw.model.Goods;
import lombok.Data;

@Data
public class GoodExp {

    private Goods goods;
    private Long cartId;
    private Integer num;
    private Double price;
}
