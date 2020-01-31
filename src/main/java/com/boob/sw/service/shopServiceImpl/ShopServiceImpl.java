package com.boob.sw.service.shopServiceImpl;

import com.boob.sw.dto.CartDto;
import com.boob.sw.dto.ShopDto;
import com.boob.sw.mapper.CartMapper;
import com.boob.sw.mapper.GoodsMapper;
import com.boob.sw.mapper.ShopClassMapper;
import com.boob.sw.model.*;
import com.boob.sw.model.exp.GoodsExp;
import com.boob.sw.service.ShopServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ShopServiceImpl implements ShopServiceDao {

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private CartMapper cartMapper;

    @Autowired
    private ShopClassMapper shopClassMapper;

    @Override
    public ShopDto getAll(Integer page) {
        ShopDto shopDto = new ShopDto();
        List<Goods> goods = goodsMapper.selectByExample(new GoodsExample());

        shopDto.setGoodsList(goods);

        return shopDto;
    }


    @Override
    public boolean addCart(Cart cart) {

        CartExample example = new CartExample();
        example.createCriteria()
                .andUIdEqualTo(cart.getuId())
                .andGIdEqualTo(cart.getgId());
        List<Cart> carts = cartMapper.selectByExample(example);

        if (carts.size() != 0) {
            //原始购物车里有该商品
            Cart oldCart = carts.get(0);
            oldCart.setGmtModified(new Date());
            oldCart.setNum(oldCart.getNum() + cart.getNum());
            return cartMapper.updateByPrimaryKey(oldCart) == 1;
        } else {
            //原始购物车里没有
            cart.setGmtModified(new Date());
            return cartMapper.insert(cart) == 1;
        }

    }

    @Override
    public CartDto getCart(Long uId) {
        //通过用户Id获取基础购物车
        CartExample cartExample = new CartExample();
        cartExample.createCriteria().andUIdEqualTo(uId);
        List<Cart> carts = cartMapper.selectByExample(cartExample);

        CartDto cartDto = new CartDto();
        List<GoodsExp> goodsExps = new ArrayList<>();
        //初始化价格
        Double newTotalPrice = 0d;
        Double save = 0d;
        Double oldTotalPrice = 0d;
        for (Cart cart : carts) {
            //获取商品信息
            GoodsExp goodsExp = new GoodsExp();
            Long gId = cart.getgId();
            Goods goods = goodsMapper.selectByPrimaryKey(gId);

            //设置多数量商品价格
            goodsExp.setGoods(goods);
            Integer num = cart.getNum();

            goodsExp.setCartId(cart.getId());
            goodsExp.setNum(num);
            goodsExp.setPrice(goods.getNewPrice() * num);
            ShopClass shopClass = shopClassMapper.selectByPrimaryKey(goods.getcId());
            goodsExp.setShopClass(shopClass);
            //加入list
            goodsExps.add(goodsExp);
            //设置总价格
            newTotalPrice += goods.getNewPrice() * num;
            oldTotalPrice += goods.getOldPrice() * num;
            save += (goods.getOldPrice() - goods.getNewPrice()) * num;

        }
        cartDto.setGoodsExps(goodsExps);
        cartDto.setNewTotalPrice(newTotalPrice);
        cartDto.setSave(save);
        cartDto.setOldTotalPrice(oldTotalPrice);
        return cartDto;
    }

    @Override
    public boolean deleteCart(Long cartId) {
        return cartMapper.deleteByPrimaryKey(cartId) == 1;
    }

    @Override
    public GoodsExp getGoodsExp(Long goodsId) {
        GoodsExp goodsExp = new GoodsExp();
        Goods goods = goodsMapper.selectByPrimaryKey(goodsId);
        ShopClass shopClass = shopClassMapper.selectByPrimaryKey(goods.getcId());
        goodsExp.setGoods(goods);
        goodsExp.setShopClass(shopClass);

        return goodsExp;
    }
}
