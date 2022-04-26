package com.example.fastfoods.service;

import com.example.fastfoods.pojo.GoodsType;

import java.util.List;

public interface cateGoryService {
    //添加分类
    int addtype(GoodsType goodsType);

    //    查看分类
    List<GoodsType> selectAllGoodsType();

    //删除分类
    int deleteGoodsTypeById(int id);

    //姓名查询分类
    List<GoodsType> selectGoodsType(String name);
}
