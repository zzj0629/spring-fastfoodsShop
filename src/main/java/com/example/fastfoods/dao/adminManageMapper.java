package com.example.fastfoods.dao;

import com.example.fastfoods.pojo.user;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface adminManageMapper {
    //管理员管理的显示所有管理员(不包括用户)
    @Select("SELECT * FROM f_user WHERE role=0")
    List<user> selectAdminWhereAdmin();
    //条件查询管理员
    @Select( "<script>"+
            "select * from f_user " +
            "where" +
            "<if test='username!=null '>                  username=#{username}    </if>" +
            "<if test='username!=null and gender!=null '>   and                     </if>"+
            "<if test='gender!=null'>                     gender=#{gender}        </if>"+
            "<if test='username!=null or gender!=null'>     and                     </if>"+
            "role=0"+
            "</script>")
    List<user>  selectAdminWhereCondition(@Param("username")String username, @Param("gender")String gender);

//    修改管理员
    @Update("UPDATE  f_user set username=#{username},password=#{password},email=#{email},gender=#{gender} where id=#{id} and role=0")
    int updateAdminById (user user);

//    添加管理员
@Insert("INSERT INTO f_user (role,username,password,email,gender,flag,activatecode,createtime)" +
        "VALUES (0,#{username},#{password},#{email},#{gender},1,#{activatecode},#{createtime})")
int addAdmin(user user);


}
