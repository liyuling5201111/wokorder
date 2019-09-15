package com.example.demo.mapper;

import com.example.demo.pojo.Workorder;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkorderMapper {
    int deleteByPrimaryKey(@Param("id") Integer id, @Param("wrcode") String wrcode);

    int insert(Workorder record);

    Workorder selectByPrimaryKey(@Param("id") Integer id, @Param("wrcode") String wrcode);

    List<Workorder> selectAll();

    int updateByPrimaryKey(Workorder record);
}