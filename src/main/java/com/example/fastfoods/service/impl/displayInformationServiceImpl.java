package com.example.fastfoods.service.impl;

import com.example.fastfoods.dao.displayInformationMapper;
import com.example.fastfoods.pojo.goods;
import com.example.fastfoods.service.displayInformationService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class displayInformationServiceImpl implements displayInformationService {
    @Autowired
    displayInformationMapper displayInformationMapper;

    //显示热销商品
    public List<goods> selectRxGoods(){ return displayInformationMapper.selectRxGoods();}

    //按分类查询商品信息
    public List<goods> selectAllByTypename(@Param("typeName") String typeName){
        return  displayInformationMapper.selectAllByTypename(typeName);
    }
    //按商品名称查询商品
    public List<goods> selectGoodsByName(@Param("name") String name){
        return displayInformationMapper.selectGoodsByName(name);
    }
    //按商品id查询商品详细信息
    public List<goods> selectGoodsById(int id){
        return displayInformationMapper.selectGoodsById(id);
    }
}
