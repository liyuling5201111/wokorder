package com.example.demo.engine.Service;

import com.example.demo.dto.WorkOrderProccessDto;
import com.example.demo.engine.Entity.Task;
import com.example.demo.pojo.TemplateAttribute;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 任务组件
 * @Author: yc
 * @CreateDate: 2019/9/14 18:44
 * @UpdateUser: yc
 * @UpdateDate: 2019/9/14 18:44
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */

public interface TaskService {
    public Task complete( WorkOrderProccessDto workOrderProccessDto);

    public List<TemplateAttribute> querWorkOrderAttribute(int templateId);

    public void setWorkorderListener(WorkorderListener workorderListener);

}
