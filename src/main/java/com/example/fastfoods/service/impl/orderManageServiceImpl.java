package com.example.fastfoods.service.impl;

import com.example.fastfoods.dao.orderManageMapper;
import com.example.fastfoods.pojo.order;
import com.example.fastfoods.service.orderManageService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class orderManageServiceImpl implements orderManageService {
    @Autowired
    orderManageMapper orderManageMapper;
    //管理员订单管理查询所有订单
    public List<order> selectAllOrder(){ return orderManageMapper.selectAllOrder(); }

    //按用户名和订单状态查询订单
    public List<order> selectByNameAndFlag(@Param("username") String username, @Param("flag") String flag){
        return orderManageMapper.selectByNameAndFlag(username,flag);
    };

    //管理员发货
    public int fahuo(order order){ return orderManageMapper.fahuo(order);}
}
