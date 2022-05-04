package com.example.fastfoods.service.impl;

import com.example.fastfoods.dao.cartMapper;
import com.example.fastfoods.pojo.cart;
import com.example.fastfoods.pojo.cartandgoods;
import com.example.fastfoods.pojo.goods;
import com.example.fastfoods.service.cartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class cartServiceImpl implements cartService {
    @Autowired
    cartMapper cartMapper;
    //查找用户的购物车
    public List<cart> selectUserCart(int uid){return cartMapper.selectUserCart(uid);}
    //用户注册后后为用户创建一个购物车
    public int addNewUserCart(cart cart){return cartMapper.addNewUserCart(cart);}
    //查询购物车中是否有商品
    public List<cart> seegid(int cid){return cartMapper.seegid(cid);}
    //如果购物车有该商品 则商品数量加1
    public int updateAddOne(cart cart){return cartMapper.updateAddOne(cart);}
    //如果购物车无该商品 向购物车中加入该商品
    public int addCommodityInCart(cart cart){return cartMapper.addCommodityInCart(cart);}
    //查看用户的购物车
    public List<cartandgoods> seeAllInCart(int cid){return cartMapper.seeAllInCart(cid);}
    //查看购物车中的商品信息
    public List<goods> seeNameAndPriceByGid(int gid){return cartMapper.seeNameAndPriceByGid(gid);}
    //修改商品数量和小计
    public int updateNumAndMoney(cart cart){return cartMapper.updateNumAndMoney(cart);}
    //求商品总金额
    public int zongJinE(int cid){return cartMapper.zongJinE(cid);}
    //按商品id删除商品
    public int deleteSP(cartandgoods cartandgoods){return cartMapper.deleteSP(cartandgoods);}
    //清空购物车
    public int deleteAllByCid(int cid){return cartMapper.deleteAllByCid(cid);}
}
