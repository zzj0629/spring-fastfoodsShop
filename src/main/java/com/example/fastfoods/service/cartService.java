package com.example.fastfoods.service;

import com.example.fastfoods.pojo.cart;
import com.example.fastfoods.pojo.cartandgoods;
import com.example.fastfoods.pojo.goods;

import java.util.List;

public interface cartService {
    //查找用户的购物车
    List<cart> selectUserCart(int uid);
    //用户注册后后为用户创建一个购物车
    int addNewUserCart(cart cart);
    //查询购物车中是否有商品
    List<cart> seegid(int cid);
    //如果购物车有该商品 则商品数量加1
    int updateAddOne(cart cart);
    //如果购物车无该商品 向购物车中加入该商品
    int addCommodityInCart(cart cart);
    //查看用户的购物车
    List<cartandgoods> seeAllInCart(int cid);
    //查看购物车中的商品信息
    List<goods> seeNameAndPriceByGid(int gid);
    //修改商品数量和小计
    int updateNumAndMoney(cart cart);
    //求商品总金额
    int zongJinE(int cid);
    //按商品id删除商品
    int deleteSP(cartandgoods cartandgoods);
    //清空购物车
    int deleteAllByCid(int cid);

}
