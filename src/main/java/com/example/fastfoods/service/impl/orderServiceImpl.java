package com.example.fastfoods.service.impl;

import com.example.fastfoods.dao.orderMapper;
import com.example.fastfoods.pojo.order;
import com.example.fastfoods.pojo.orderandaddress;
import com.example.fastfoods.pojo.orderandgoods;
import com.example.fastfoods.service.orderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class orderServiceImpl implements orderService {
    @Autowired
    orderMapper orderMapper;
    //订单列表页
    //查询所有订单
    public List<orderandaddress> selectOrderAllByUid(int uid){return orderMapper.selectOrderAllByUid(uid);}
    //查询表中有几条数据
    public int howMuchOrderByUid(int uid){return orderMapper.howMuchOrderByUid(uid);}
    //确认收货
    public int shouhuo(order order){return orderMapper.shouhuo(order);}
    //删除订单
    public int deleteOrderById(order order){return orderMapper.deleteOrderById(order);}
    //删除订单详情
    public int deleteOrderdetailByOid(order order){return orderMapper.deleteOrderdetailByOid(order);}

    //订单详情页
    //按订单id查询订单信息
    public List<orderandaddress> selectAllByOid(String id){return orderMapper.selectAllByOid(id);}
    //按oid查看商品信息
    public List<orderandgoods> selectGoodsByOid(String oid){return orderMapper.selectGoodsByOid(oid);}
    //订单支付
    public int zhifu(order order){return orderMapper.zhifu(order);}
}
