package com.example.fastfoods.service.impl;

import com.example.fastfoods.dao.cateGoryMapper;
import com.example.fastfoods.pojo.GoodsType;
import com.example.fastfoods.service.cateGoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class cateGoryServiceImpl implements cateGoryService {
    @Autowired
    cateGoryMapper cateGoryMapper;
    //添加分类
    public int addtype(GoodsType goodsType) { return cateGoryMapper.addtype(goodsType); }
}
