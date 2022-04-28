package com.example.fastfoods.controller;

import com.example.fastfoods.pojo.order;
import com.example.fastfoods.service.orderManageService;
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
    public List<order> selectAllOrder(){ return orderManageService.selectAllOrder();};
}
