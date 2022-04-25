package com.example.fastfoods.controller;

import com.example.fastfoods.pojo.GoodsType;
import com.example.fastfoods.service.cateGoryService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cateGoryController {
    @Autowired
    cateGoryService cateGoryService;
    @PostMapping(value = "addtype")
    int addtype(@Param("name") String name){
        GoodsType goodsType = new GoodsType();
        goodsType.setName(name);
        return cateGoryService.addtype(goodsType);
    }
}
