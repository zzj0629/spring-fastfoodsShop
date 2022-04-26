package com.example.fastfoods.service;

import com.example.fastfoods.pojo.goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface commodityService {
    List<goods> selectAllGoods();

    //    添加商品
    int addGoods(goods goods);

    //删除商品
    int deleteGoodsTypeById(int id);

    //修改商品
    int updateGoods(goods goods);

    //条件查询商品
    List<goods> selectGoods(@Param("typeName") String typeName, @Param("pubdate") String pubdate);
}
