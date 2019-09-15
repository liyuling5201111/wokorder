package com.example.demo.mapper;

import com.example.demo.pojo.TemplateAttribute;
import java.util.List;

public interface TemplateAttributeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TemplateAttribute record);

    TemplateAttribute selectByPrimaryKey(Integer id);

    List<TemplateAttribute> selectAll();

    int updateByPrimaryKey(TemplateAttribute record);
}