package com.example.fastfoods.service;

import com.example.fastfoods.pojo.order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface orderManageService {
    //管理员订单管理查询所有订单
    List<order> selectAllOrder();

    //按用户名和订单状态查询订单
    List<order> selectByNameAndFlag(@Param("username") String username, @Param("flag") String flag);

    //管理员发货
    int fahuo(order order);
}
