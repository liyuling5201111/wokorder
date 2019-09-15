package com.example.demo.service;

import com.example.demo.dto.NodeDto;
import com.example.demo.dto.WorkOrderProccessDto;
import com.example.demo.engine.Entity.Task;
import com.example.demo.engine.Service.TaskService;
import com.example.demo.engine.Service.WorkorderListener;
import com.example.demo.mapper.TemplateAttributeMapper;
import com.example.demo.mapper.WorkorderMapper;
import com.example.demo.mapper.ext.TemplateAttributeMapperExt;
import com.example.demo.pojo.TemplateAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class StrartProcessService {
    @Autowired
    TemplateAttributeMapperExt templateAttributeMapperExt;
    @Autowired
    TaskService taskService;
    @Autowired
    WorkorderMapper workorderMapper;
    List<TemplateAttribute> templateAttributes ;
    public  String getTaskUrl(NodeDto nodeDto){
         templateAttributes = templateAttributeMapperExt.selectAllByTemplateId(nodeDto.getTemplateId());
         TemplateAttribute templateAttribute = templateAttributes.get(nodeDto.getExecuteOrder());
         return templateAttribute.getUrl();
     }
    public Task execute(WorkOrderProccessDto workOrderProccessDto){
        //对外暴露一个监听端口，提供对指定的事件进行处理，譬如新建工单时，和审核时，需要额外的业务
        taskService.setWorkorderListener(new WorkorderListener() {
            @Override
            public boolean createWopkorder() {
                int i=workorderMapper.insert(workOrderProccessDto.getWorkorder());
                if(i>0){
                    return  true;
                }
               return false;
            }

            @Override
            public boolean aduit() {
                return true;
            }
        });
        taskService.complete(templateAttributes,workOrderProccessDto);
        return null;

    }
}