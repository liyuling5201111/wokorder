package com.example.demo.mapper.ext;

import com.example.demo.pojo.TemplateAttribute;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface TemplateAttributeMapperExt {

    List<TemplateAttribute> selectAllByTemplateId(int templateId);

    @Select("select id, url, timeout, createtime, updateTime, template_id, nodeCode, nodeName" +
            " from template_attribute where template_id=#{templateId} and roleid=#{roleid}")
    public List<TemplateAttribute> selectByTemplateIdAndRoleId(@Param("templateId") Integer templateId,@Param("roleid") Integer roleid);


}