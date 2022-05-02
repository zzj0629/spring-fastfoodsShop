package com.example.fastfoods.controller;

import com.example.fastfoods.pojo.cart;
import com.example.fastfoods.service.cartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cartController {
    @Autowired
    cartService cartService;

    //用户注册后后为用户创建一个购物车
    @PostMapping(value = "addNewUserCard")
    public int addNewUserCard(cart cart){return cartService.addNewUserCard(cart);}
}
