package com.example.demo.mapper;

import com.example.demo.pojo.WorkorderTemplate;
import java.util.List;

public interface WorkorderTemplateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WorkorderTemplate record);

    WorkorderTemplate selectByPrimaryKey(Integer id);

    List<WorkorderTemplate> selectAll();

    int updateByPrimaryKey(WorkorderTemplate record);
}