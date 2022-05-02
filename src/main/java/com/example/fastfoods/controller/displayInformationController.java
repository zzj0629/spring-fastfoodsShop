package com.example.fastfoods.controller;

import com.example.fastfoods.pojo.goods;
import com.example.fastfoods.service.displayInformationService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class displayInformationController {
    @Autowired
    displayInformationService displayInformationService;

    //显示热销商品
    @PostMapping(value = "selectRxGoods")
    public List<goods> selectRxGoods(){ return displayInformationService.selectRxGoods();}

    //按分类查询商品信息
    @PostMapping(value = "selectAllByTypename")
    public List<goods> selectAllByTypename(@Param("typeName") String typeName){
        return displayInformationService.selectAllByTypename(typeName);
    }
    //按商品名称查询商品
    @PostMapping(value = "selectGoodsByName")
    public List<goods> selectGoodsByName(@Param("name") String name){
        return displayInformationService.selectGoodsByName(name);
    }
    //按商品id查询商品详细信息
    @PostMapping(value = "selectGoodsById")
    public List<goods> selectGoodsById(int id){
        return displayInformationService.selectGoodsById(id);
    }
}
