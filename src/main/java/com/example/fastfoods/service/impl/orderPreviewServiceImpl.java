package com.example.fastfoods.service.impl;

import com.example.fastfoods.dao.orderPreviewMapper;
import com.example.fastfoods.pojo.cart;
import com.example.fastfoods.pojo.cartandgoods;
import com.example.fastfoods.pojo.order;
import com.example.fastfoods.pojo.useraddress;
import com.example.fastfoods.service.orderPreviewService;
import org.apache.ibatis.annotations.Param;
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
    //获取用户地址
    public List<useraddress> seeAddressByUid(int uid){return orderPreviewMapper.seeAddressByUid(uid);}
    //单击生成订单 创建一个订单
    //新增 订单
    public int addOrder(order order){return orderPreviewMapper.addOrder(order);}
    //新增 订单详情
    public int addOrderDetail(order order){return orderPreviewMapper.addOrderDetail(order);}
    //清空购物车 执行：cartController=>deleteAllByCid
    //删除订单
    public int deleteOrderById(@Param("id") String id){return orderPreviewMapper.deleteOrderById(id);}
}
