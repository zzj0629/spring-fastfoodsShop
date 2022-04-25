package com.example.fastfoods.dao;


import com.example.fastfoods.pojo.GoodsType;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface cateGoryMapper {
    //添加分类
    @Insert("INSERT INTO f_goodstype (name,level,flag)" +
            "VALUES (#{name},1,1)")
    int addtype(GoodsType goodsType);
}
