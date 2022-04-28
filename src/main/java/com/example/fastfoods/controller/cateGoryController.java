package com.example.fastfoods.controller;

import com.example.fastfoods.pojo.GoodsType;
import com.example.fastfoods.service.cateGoryService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class cateGoryController {
    @Autowired
    cateGoryService cateGoryService;

    //添加商品分类
    @PostMapping(value = "addtype")
    int addtype(@Param("name") String name) {
        GoodsType goodsType = new GoodsType();
        goodsType.setName(name);
        return cateGoryService.addtype(goodsType);
    }

    //查看分类
    @PostMapping(value = "selectCategory")
    List<GoodsType> selectCategory() {
        return cateGoryService.selectAllGoodsType();
    }

    //删除分类
    @PostMapping(value = "deleteCategoryById")
    int deleteCategoryById(int id) {
        return cateGoryService.deleteGoodsTypeById(id);
    }

    //selectAdminByName
    @PostMapping(value = "selectAdminByName")
    List<GoodsType> selectAdminByName(String name) {
        return cateGoryService.selectGoodsType(name);
    }
}
