package com.example.fastfoods.service;

import com.example.fastfoods.pojo.cart;
import com.example.fastfoods.pojo.cartandgoods;

import java.util.List;

public interface orderPreviewService {
    //查找用户的购物车
    List<cart> selectUserCartById(int uid);
    //查看用户的购物车
    List<cartandgoods> seeAll(int cid);
}
