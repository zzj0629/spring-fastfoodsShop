package com.example.fastfoods.controller;

import com.example.fastfoods.pojo.cart;
import com.example.fastfoods.pojo.cartandgoods;
import com.example.fastfoods.pojo.goods;
import com.example.fastfoods.service.cartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class cartController {
    @Autowired
    cartService cartService;

    //查找用户的购物车
    @PostMapping(value = "selectUserCart")
    public List<cart> selectUserCart(int uid){return cartService.selectUserCart(uid);}
    //用户注册后后为用户创建一个购物车
    @PostMapping(value = "addNewUserCard")
    public int addNewUserCart(cart cart){return cartService.addNewUserCart(cart);}
    //查询购物车中是否有商品
    @PostMapping(value = "seegid")
    public List<cart> seegid(int cid){return cartService.seegid(cid);}
    //如果购物车有该商品 则商品数量加1
    @PostMapping(value = "updateAddOne")
    public int updateAddOne(cart cart){return cartService.updateAddOne(cart);}
    //如果购物车无该商品 向购物车中加入该商品
    @PostMapping(value = "addCommodityInCart")
    public int addCommodityInCart(cart cart){return cartService.addCommodityInCart(cart);}
    //查看用户的购物车
    @PostMapping(value = "seeAllInCart")
    public List<cartandgoods> seeAllInCart(int cid){return cartService.seeAllInCart(cid);}
    //查看购物车中的商品信息
    @PostMapping(value = "seeNameAndPriceByGid")
    public List<goods> seeNameAndPriceByGid(int gid){return cartService.seeNameAndPriceByGid(gid);}
    //修改商品数量和小计
    @PostMapping(value = "updateNumAndMoney")
    public int updateNumAndMoney(cart cart){return cartService.updateNumAndMoney(cart);}
    //求商品总金额
    @PostMapping(value = "zongJinE")
    public int zongJinE(int cid){return cartService.zongJinE(cid);}
    //按商品id删除商品
    @PostMapping(value = "deleteSP")
    public int deleteSP(cartandgoods cartandgoods){return cartService.deleteSP(cartandgoods);}
    //清空购物车
    @PostMapping(value = "deleteAllByCid")
    public int deleteAllByCid(int cid){return cartService.deleteAllByCid(cid);}
}
