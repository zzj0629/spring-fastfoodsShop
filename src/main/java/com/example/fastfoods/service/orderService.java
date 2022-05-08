package com.example.fastfoods.service;

import com.example.fastfoods.pojo.order;
import com.example.fastfoods.pojo.orderandaddress;
import com.example.fastfoods.pojo.orderandgoods;

import java.util.List;

public interface orderService {
    //订单列表页
    //查询所有订单
    List<orderandaddress> selectOrderAllByUid(int uid);
    //查询表中有几条数据
    int howMuchOrderByUid(int uid);
    //确认收货
    int shouhuo(order order);
    //删除订单
    int deleteOrderById(order order);
    //删除订单详情
    int deleteOrderdetailByOid(order order);
    //订单详情页
    //按订单id查询订单信息
    List<orderandaddress> selectAllByOid(String id);
    //按oid查看商品信息
    List<orderandgoods> selectGoodsByOid(String oid);
    //订单支付
    int zhifu(order order);
}
