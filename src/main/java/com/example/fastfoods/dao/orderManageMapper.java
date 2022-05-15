package com.example.fastfoods.dao;

import com.example.fastfoods.pojo.order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface orderManageMapper {
    //管理员订单管理查询所有订单
    @Select("SELECT o.*,u.username FROM f_order o,f_user u where o.uid=u.id and o.flag != 1 and o.flag != 4")
    List<order> selectAllOrder();

    //按用户名和订单状态查询订单
    @Select("select o.*,u.username from f_order o LEFT JOIN f_user u ON o.uid=u.id where" +
            " u.username like concat('%',#{username},'%')" +
            " and o.flag like concat('%',#{flag},'%')" +
            " and o.flag != 1 and o.flag != 4")
    List<order> selectByNameAndFlag(@Param("username") String username,@Param("flag") String flag);

    //管理员发货
    @Update("update f_order set flag=3 where id=#{id}")
    int fahuo(order order);
}
