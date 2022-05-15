package com.example.fastfoods.service;

import com.example.fastfoods.pojo.GoodsType;
import com.example.fastfoods.pojo.goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface commodityService {
    //查看商品信息
    List<goods> selectAllGoods();

    //查看商品分类
    List<GoodsType> selectGoodsType();

    //添加商品
    int addGoods(goods goods);

    //删除商品
    int deleteGoodsTypeById(int id);

    //修改商品
    int updateGoods(goods goods);

    //条件查询商品
    List<goods> selectGoods(@Param("name") String name, @Param("typeName") String typeName, @Param("pubdate") String pubdate);
}
