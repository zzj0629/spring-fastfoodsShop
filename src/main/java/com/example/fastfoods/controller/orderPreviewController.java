package com.example.fastfoods.controller;

import com.example.fastfoods.pojo.cart;
import com.example.fastfoods.pojo.cartandgoods;
import com.example.fastfoods.pojo.order;
import com.example.fastfoods.pojo.useraddress;
import com.example.fastfoods.service.orderPreviewService;
import com.example.fastfoods.utils.RandomUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class orderPreviewController {
    @Autowired
    orderPreviewService orderPreviewService;
    //查找用户的购物车
    @PostMapping(value = "selectUserCartById")
    public List<cart> selectUserCartById(int uid){return orderPreviewService.selectUserCartById(uid);}
    //查看用户的购物车
    @PostMapping(value = "seeAll")
    public List<cartandgoods> seeAll(int cid){return orderPreviewService.seeAll(cid);}
    //获取用户地址
    @PostMapping(value = "seeAddressByUid")
    public List<useraddress> seeAddressByUid(int uid){return orderPreviewService.seeAddressByUid(uid);}
    //单击生成订单 创建一个订单
    //新增 订单
    @PostMapping(value = "addOrder")
    public String addOrder(order order){
        order.setId(RandomUtils.createOrderId());
        orderPreviewService.addOrder(order);
        return order.getId();
    }
    //新增 订单详情
    @PostMapping(value = "addOrderDetail")
    public int addOrderDetail(order order){return orderPreviewService.addOrderDetail(order);}
    //清空购物车 执行：cartController=>deleteAllByCid
    //删除订单
    @PostMapping(value = "deleteOrderById")
    public int deleteOrderById(@Param("id") String id){return orderPreviewService.deleteOrderById(id);}
}
