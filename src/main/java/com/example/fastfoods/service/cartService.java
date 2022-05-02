package com.example.fastfoods.service;

import com.example.fastfoods.pojo.cart;

public interface cartService {
    //用户注册后后为用户创建一个购物车
    int addNewUserCard(cart cart);
}
