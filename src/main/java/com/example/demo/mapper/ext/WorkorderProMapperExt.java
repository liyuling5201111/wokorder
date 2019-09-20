package com.example.demo.mapper.ext;

import com.example.demo.pojo.WorkorderPro;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface WorkorderProMapperExt {

    List<WorkorderPro> selectProByUserId(int userId);

    List<WorkorderPro> selectProByWrcode(String wrcode);
}