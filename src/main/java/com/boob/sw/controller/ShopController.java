package com.boob.sw.controller;

import com.boob.sw.dto.CartDto;
import com.boob.sw.dto.ShopDto;
import com.boob.sw.model.Cart;
import com.boob.sw.model.User;
import com.boob.sw.service.ShopServiceDao;
import com.boob.sw.utils.MessageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private ShopServiceDao shopServiceDao;

    /**
     * 查询所有商品
     *
     * @param model
     * @return
     */
    @RequestMapping("goodsList")
    public String getAll(Model model) {
        ShopDto shopDto = shopServiceDao.getAll(null);
        model.addAttribute("shopDto", shopDto);

        return "shop/goodsList";
    }

    @RequestMapping("addCart")
    public String addCart(Cart cart,
                          HttpServletRequest request,
                          Model model) {

        User user = (User) request.getSession().getAttribute("user");
        cart.setuId(user.getId());

        boolean b = shopServiceDao.addCart(cart);

        MessageUtils.addMessage(b, model);

        return "forward:/shop/goodsList";
    }


    @RequestMapping("cart")
    public String cart(HttpServletRequest request, Model model) {
        User user = (User) request.getSession().getAttribute("user");
        CartDto cartDto = shopServiceDao.getCart(user.getId());
        model.addAttribute("cartDto", cartDto);

        return "shop/cart";
    }


    @RequestMapping("deleteCart")
    public String deleteCart(@RequestParam("cartId") Long cartId, Model model) {

        boolean b = shopServiceDao.deleteCart(cartId);

        MessageUtils.addMessage(b, model);
        return "forward:/shop/cart";
    }

}
