package com.example.demo.mapper.ext;

import com.example.demo.pojo.TemplateAttribute;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TemplateAttributeMapperExt {

    List<TemplateAttribute> selectAllByTemplateId(int templateId);
}