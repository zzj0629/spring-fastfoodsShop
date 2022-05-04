package com.example.fastfoods.service.impl;

import com.example.fastfoods.dao.orderPreviewMapper;
import com.example.fastfoods.pojo.cart;
import com.example.fastfoods.pojo.cartandgoods;
import com.example.fastfoods.service.orderPreviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class orderPreviewServiceImpl implements orderPreviewService {
    @Autowired
    orderPreviewMapper orderPreviewMapper;
    //查找用户的购物车
    public List<cart> selectUserCartById(int uid){return orderPreviewMapper.selectUserCartById(uid);}
    //查看用户的购物车
    public List<cartandgoods> seeAll(int cid){return orderPreviewMapper.seeAll(cid);}
}
