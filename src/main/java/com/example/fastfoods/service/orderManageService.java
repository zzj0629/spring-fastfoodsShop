package com.example.fastfoods.service;

import com.example.fastfoods.pojo.order;

import java.util.List;

public interface orderManageService {
    //管理员订单管理查询所有订单
    List<order> selectAllOrder();
}
