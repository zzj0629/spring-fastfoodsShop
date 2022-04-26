package com.example.fastfoods.controller;

import com.example.fastfoods.pojo.goods;
import com.example.fastfoods.pojo.user;
import com.example.fastfoods.service.adminManageService;
import com.example.fastfoods.service.commodityService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class commodityController {
    @Autowired
    commodityService commodityService;

    @PostMapping(value = "selectFoodsInformation")
    public List<goods> selectFoodsInformation() {
        return commodityService.selectAllGoods();
    }

    //    添加商品
    @PostMapping(value = "insertFoodsInformation")
    public int insertFoodsInformation(String name, double price, String pubdate, String typeName, String intro, String picture, int star) {
        goods goods = new goods();
        goods.setName(name);
        goods.setPrice(price);
        goods.setPubdate(pubdate);
        goods.setTypeName(typeName);
        goods.setIntro(intro);
        goods.setPicture(picture);
        goods.setStar(star);
        return commodityService.addGoods(goods);
    }

    //删除商品
    @PostMapping(value = "deleteFoodsInformation")
    public int deleteFoodsInformation(int id) {
        return commodityService.deleteGoodsTypeById(id);
    }

    //修改商品
    @PostMapping(value = "updateFoodsInformation")
    public int updateFoodsInformation(int id, String name, double price, String pubdate, String typeName, String intro, String picture, int star) {
        goods goods = new goods();
        goods.setId(id);
        goods.setName(name);
        goods.setPrice(price);
        goods.setPubdate(pubdate);
        goods.setTypeName(typeName);
        goods.setIntro(intro);
        goods.setPicture(picture);
        goods.setStar(star);
        return commodityService.updateGoods(goods);
    }

    //条件查询商品
    @PostMapping(value = "selectGoods")
    public List<goods> selectGoods(@Param("typeName") String typeName, @Param("pubdate") String pubdate) {
        return commodityService.selectGoods(typeName, pubdate);
    }
}
