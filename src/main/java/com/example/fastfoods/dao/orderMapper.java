package com.example.fastfoods.dao;

import com.example.fastfoods.pojo.order;
import com.example.fastfoods.pojo.orderandaddress;
import com.example.fastfoods.pojo.orderandgoods;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface orderMapper {
    //订单列表页
    //查询所有订单
    @Select("select fo.*,fua.* from f_order fo,f_useraddress fua where fo.uaid = fua.id and fo.uid = #{uid}")
    List<orderandaddress> selectOrderAllByUid(int uid);
    //查询表中有几条数据
    @Select("select count(id) from f_order where uid = #{uid}")
    int howMuchOrderByUid(int uid);
    //确认收货
    @Update("update f_order set flag=4 where id=#{id}")
    int shouhuo(order order);
    //删除订单
    @Delete("delete from f_order where id=#{id}")
    int deleteOrderById(order order);
    //删除订单详情
    @Delete("delete from f_orderdetail where oid=#{oid} ")
    int deleteOrderdetailByOid(order order);
    //订单详情页
    //按订单id查询订单信息
    @Select("select fo.*,fua.* from f_order fo,f_useraddress fua where fo.uaid = fua.id and fo.id = #{id}")
    List<orderandaddress> selectAllByOid(String id);
    //按oid查看商品信息
    @Select("select * from f_orderdetail od,f_goods g where g.id=od.gid and oid=#{oid}")
    List<orderandgoods> selectGoodsByOid(String oid);
    //订单支付
    @Update("update f_order set flag=2 where id=#{id}")
    int zhifu(order order);
}
