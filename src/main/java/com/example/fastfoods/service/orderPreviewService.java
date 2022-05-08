package com.example.fastfoods.service;

import com.example.fastfoods.pojo.cart;
import com.example.fastfoods.pojo.cartandgoods;
import com.example.fastfoods.pojo.order;
import com.example.fastfoods.pojo.useraddress;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface orderPreviewService {
    //查找用户的购物车
    List<cart> selectUserCartById(int uid);
    //查看用户的购物车
    List<cartandgoods> seeAll(int cid);
    //获取用户地址
    List<useraddress> seeAddressByUid(int uid);
    //单击生成订单 创建一个订单
    //新增 订单
    int addOrder(order order);
    //新增 订单详情
    int addOrderDetail(order order);
    //清空购物车 执行：cartController=>deleteAllByCid
    //删除订单
    int deleteOrderById(@Param("id") String id);
}
