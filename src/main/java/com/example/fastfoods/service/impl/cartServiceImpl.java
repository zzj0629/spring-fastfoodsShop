package com.example.fastfoods.service.impl;

import com.example.fastfoods.dao.cartMapper;
import com.example.fastfoods.pojo.cart;
import com.example.fastfoods.service.cartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class cartServiceImpl implements cartService {
    @Autowired
    cartMapper cartMapper;

    //用户注册后后为用户创建一个购物车
    public int addNewUserCard(cart cart){return cartMapper.addNewUserCard(cart);}
}
