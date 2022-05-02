package com.example.fastfoods.dao;

import com.example.fastfoods.pojo.useraddress;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface useraddressMapper {
    //新增地址
    @Insert("insert into f_useraddress(name,phone,detail,uid,flag ) values(#{name},#{phone},#{detail},#{uid},1)")
    int addAddress(useraddress useraddress);
    //查询地址
    @Select("select * from f_useraddress where uid=#{uid} order by flag desc")
    List<useraddress> lookAllByUid(int uid);
    //修改地址
    @Update("update f_useraddress set name=#{name},phone=#{phone},detail=#{detail} where id=#{id}")
    int updateById(useraddress useraddress);
    //设置默认地址
    @Update("update f_useraddress set flag=2 where id=#{id}")
    int updateMoRen(useraddress useraddress);
    //解除默认地址
    @Update("update f_useraddress set flag=1 where id=#{id}")
    int updateRemoveMoRen(useraddress useraddress);
    //删除地址
    @Delete("delete from f_useraddress where id = #{id}")
    int deleteById(int id);
}
