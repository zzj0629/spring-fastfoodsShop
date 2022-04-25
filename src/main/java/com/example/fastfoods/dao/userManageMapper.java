package com.example.fastfoods.dao;

import com.example.fastfoods.pojo.user;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface userManageMapper {
    //用户管理的显示所有用户(不包括管理员)
    @Select("SELECT * FROM f_user WHERE role=1")
    List<user>  selectUserWhereUser();

//    删除用户
    @Delete("DELETE FROM f_user where id=#{id}")
    int  deleteUserById(int id);

    //条件查询用户
    @Select(  "<script>"+
            "select * from f_user " +
            "where" +
            "<if test='username!=null '>                  username=#{username}    </if>" +
            "<if test='username!=null and gender!=null '>   and                     </if>"+
            "<if test='gender!=null'>                     gender=#{gender}        </if>"+
            "<if test='username!=null or gender!=null'>     and                     </if>"+
            "role=1"+
            "</script>")
    List<user>  selectUserWhereCondition(@Param("username")String username,@Param("gender")String gender);
}
