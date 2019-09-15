package com.example.demo.engine.Service;

import com.example.demo.dto.TemplateAttributeDto;
import com.example.demo.dto.WorkorderTemplateDto;
import com.example.demo.pojo.WorkorderTemplate;

import java.util.List;


public interface RepositoryService {
   public int saveWorkOrderTemplate(WorkorderTemplateDto workorderTemplateDto);
 /*/**

 * 方法实现说明

 * @author      作者姓名

 * @param null

 * @return

 * @exception

 * @date        2019/9/14 16:29

 */
 public boolean saveTemplateAttribute(WorkorderTemplateDto workorderTemplateDto,List<TemplateAttributeDto> templateAttributeDto);
}
