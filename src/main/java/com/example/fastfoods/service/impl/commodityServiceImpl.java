package com.example.fastfoods.service.impl;

import com.example.fastfoods.dao.commodityMapper;
import com.example.fastfoods.pojo.GoodsType;
import com.example.fastfoods.pojo.goods;
import com.example.fastfoods.service.commodityService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class commodityServiceImpl implements commodityService {
    @Autowired
    commodityMapper commodityMapper;

    //查询所有商品
    public List<goods> selectAllGoods() {
        return commodityMapper.selectAllGoods();
    }

    //查看商品分类
    public List<GoodsType> selectGoodsType(){return commodityMapper.selectGoodsType();}

    //添加商品
    @Override
    public int addGoods(goods goods) {
        return commodityMapper.addGoods(goods);
    }

    //删除商品
    @Override
    public int deleteGoodsTypeById(int id) {
        return commodityMapper.deleteGoodsTypeById(id);
    }

    //修改商品
    @Override
    public int updateGoods(goods goods) {
        return commodityMapper.updateGoods(goods);
    }

    //条件查询商品
    @Override
    public List<goods> selectGoods(@Param("name") String name, @Param("typeName") String typeName, @Param("pubdate") String pubdate) {
        return commodityMapper.selectGoods(name, typeName, pubdate);
    }
}
