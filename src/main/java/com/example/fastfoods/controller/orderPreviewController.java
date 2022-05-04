package com.example.fastfoods.controller;

import com.example.fastfoods.pojo.cart;
import com.example.fastfoods.pojo.cartandgoods;
import com.example.fastfoods.service.orderPreviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class orderPreviewController {
    @Autowired
    orderPreviewService orderPreviewService;
    //查找用户的购物车
    @PostMapping(value = "selectUserCartById")
    public List<cart> selectUserCartById(int uid){return orderPreviewService.selectUserCartById(uid);}
    //查看用户的购物车
    @PostMapping(value = "seeAll")
    public List<cartandgoods> seeAll(int cid){return orderPreviewService.seeAll(cid);}
}
