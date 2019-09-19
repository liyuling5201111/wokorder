package com.example.demo.mapper.ext;

import com.example.demo.pojo.Workorder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WorkorderMapperExt {

    List<Workorder> selectByUserIdWrcode(@Param("userId") Integer userId, @Param("wrcode") String wrcode);

}