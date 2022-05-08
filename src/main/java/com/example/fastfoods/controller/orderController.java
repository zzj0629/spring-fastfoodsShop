package com.example.fastfoods.controller;

import com.example.fastfoods.pojo.order;
import com.example.fastfoods.pojo.orderandaddress;
import com.example.fastfoods.pojo.orderandgoods;
import com.example.fastfoods.service.orderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class orderController {
    @Autowired
    orderService orderService;
    //订单列表页
    //查询所有订单
    @PostMapping(value = "selectOrderAllByUid")
    public List<orderandaddress> selectOrderAllByUid(int uid){return orderService.selectOrderAllByUid(uid);}
    //查询表中有几条数据
    @PostMapping(value = "howMuchOrderByUid")
    public int howMuchOrderByUid(int uid){return orderService.howMuchOrderByUid(uid);}
    //确认收货
    @PostMapping(value = "shouhuo")
    public int shouhuo(order order){return orderService.shouhuo(order);}
    //删除订单
    @PostMapping(value="shanchuOrderById")
    public int deleteOrderById(order order){return orderService.deleteOrderById(order);}
    //删除订单详情
    @PostMapping(value = "deleteOrderdetailByOid")
    public int deleteOrderdetailByOid(order order){return orderService.deleteOrderdetailByOid(order);}

    //订单详情页
    //按订单id查询订单信息
    @PostMapping(value = "selectAllByOid")
    public List<orderandaddress> selectAllByOid(String id){return orderService.selectAllByOid(id);}
    //按oid查看商品信息
    @PostMapping(value = "selectGoodsByOid")
    public List<orderandgoods> selectGoodsByOid(String oid){return orderService.selectGoodsByOid(oid);}
    //订单支付
    @PostMapping(value = "zhifu")
    public int zhifu(order order){return orderService.zhifu(order);}
}
