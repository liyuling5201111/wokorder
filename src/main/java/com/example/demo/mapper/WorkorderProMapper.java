package com.example.demo.mapper;

import com.example.demo.pojo.WorkorderPro;
import java.util.List;

public interface WorkorderProMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WorkorderPro record);

    WorkorderPro selectByPrimaryKey(Integer id);

    List<WorkorderPro> selectAll();

    int updateByPrimaryKey(WorkorderPro record);
}