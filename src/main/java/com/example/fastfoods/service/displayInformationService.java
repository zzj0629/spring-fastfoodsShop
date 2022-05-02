package com.example.fastfoods.service;

import com.example.fastfoods.pojo.goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface displayInformationService {
    //显示热销商品
    List<goods> selectRxGoods();
    //按分类查询商品信息（商品信息分类显示）
    List<goods> selectAllByTypename(@Param("typeName") String typeName);
    //按商品名称查询商品（搜索商品）
    List<goods> selectGoodsByName(@Param("name") String name);
    //按商品id查询商品详细信息（查看商品详情）
    List<goods> selectGoodsById(int id);
}
