package com.example.fastfoods.service.impl;

import com.example.fastfoods.dao.cateGoryMapper;
import com.example.fastfoods.pojo.GoodsType;
import com.example.fastfoods.service.cateGoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class cateGoryServiceImpl implements cateGoryService {
    @Autowired
    cateGoryMapper cateGoryMapper;

    //添加分类
    public int addtype(GoodsType goodsType) {
        return cateGoryMapper.addtype(goodsType);
    }

    //查询所有分类
    @Override
    public List<GoodsType> selectAllGoodsType() {
        return cateGoryMapper.selectAllGoodsType();
    }

    //    删除分类
    @Override
    public int deleteGoodsTypeById(int id) {
        return cateGoryMapper.deleteGoodsTypeById(id);
    }

    //条件查询分类
    @Override
    public List<GoodsType> selectGoodsType(String name) {
        return cateGoryMapper.selectGoodsType(name);
    }
}
