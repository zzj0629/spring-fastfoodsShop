package com.example.fastfoods.controller;

import com.example.fastfoods.pojo.order;
import com.example.fastfoods.service.orderManageService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class orderManageController {
    @Autowired
    orderManageService orderManageService;
    //管理员订单管理查询所有订单
    @PostMapping(value = "selectAllOrder")
    public List<order> selectAllOrder(){ return orderManageService.selectAllOrder();}

    //按用户名和订单状态查询订单
    @PostMapping(value = "selectByNameAndFlag")
    public List<order> selectByNameAndFlag(@Param("username") String username, @Param("flag") String flag) {
        return orderManageService.selectByNameAndFlag(username, flag);
    }

    //管理员发货
    @PostMapping(value = "fahuo")
    int fahuo(order order){ return  orderManageService.fahuo(order);}
}
