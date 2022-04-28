package com.example.fastfoods.dao;

import com.example.fastfoods.pojo.order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface orderManageMapper {
    //管理员订单管理查询所有订单
    @Select("SELECT o.*,u.username FROM f_order o LEFT JOIN f_user u ON o.uid=u.id")
    List<order> selectAllOrder();
}
