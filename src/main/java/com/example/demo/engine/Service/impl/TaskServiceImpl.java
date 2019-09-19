package com.example.demo.engine.Service.impl;

import com.example.demo.dto.WorkOrderProccessDto;
import com.example.demo.engine.Entity.Task;
import com.example.demo.engine.Entity.TaskEntity;
import com.example.demo.engine.Service.TaskService;

import com.example.demo.engine.Service.WorkorderListener;
import com.example.demo.engine.constants.WorkOrderProState;
import com.example.demo.engine.constants.WorkOrderProStateEnum;
import com.example.demo.mapper.WorkorderProMapper;

import com.example.demo.mapper.ext.TemplateAttributeMapperExt;
import com.example.demo.pojo.TemplateAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    WorkorderProMapper workorderProMapper;
    @Autowired
    TemplateAttributeMapperExt templateAttributeMapperExt;

    private WorkorderListener workorderListener;
    @Override
    public Task complete(WorkOrderProccessDto workOrderProccessDto) {
        switch (Integer.valueOf(workOrderProccessDto.getWorkorderPro().getState())){
            case WorkOrderProState.CREATE:
                workorderListener.createWopkorder();
                break;
            case WorkOrderProState.ADUIT:
                workorderListener.aduit();
                break;
        }
       int i= workorderProMapper.insert(workOrderProccessDto.getWorkorderPro());
       Task task=new TaskEntity();
       task.setSuccess(true);
       task.setMessage(workOrderProccessDto.getWorkorderPro().getNodename());
       task.setTaskId(workOrderProccessDto.getWorkorderPro().getId());
        return task;
    }

    @Override
    public List<TemplateAttribute> querWorkOrderAttribute(int templateId) {
        return templateAttributeMapperExt.selectAllByTemplateId(templateId);
    }

    public void setWorkorderListener(WorkorderListener workorderListener) {
        this.workorderListener = workorderListener;
    }
}
