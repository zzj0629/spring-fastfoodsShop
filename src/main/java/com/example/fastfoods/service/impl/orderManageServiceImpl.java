package com.example.fastfoods.service.impl;

import com.example.fastfoods.dao.orderManageMapper;
import com.example.fastfoods.pojo.order;
import com.example.fastfoods.service.orderManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class orderManageServiceImpl implements orderManageService {
    @Autowired
    orderManageMapper orderManageMapper;
    //管理员订单管理查询所有订单
    public List<order> selectAllOrder(){ return orderManageMapper.selectAllOrder(); }
}
