package com.example.demo.service;

import com.example.demo.dto.NodeDto;
import com.example.demo.dto.WorkOrderProccessDto;
import com.example.demo.engine.Service.RuntimeService;
import com.example.demo.engine.Service.TaskService;
import com.example.demo.engine.Service.WorkorderListener;
import com.example.demo.mapper.TemplateAttributeMapper;
import com.example.demo.mapper.WorkorderMapper;
import com.example.demo.mapper.ext.TemplateAttributeMapperExt;
import com.example.demo.pojo.TemplateAttribute;
import com.example.demo.util.CallResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class StrartProcessService {
    @Autowired
    private TemplateAttributeMapperExt templateAttributeMapperExt;
    @Autowired
    private TemplateAttributeMapper templateAttributeMapper;
    @Autowired
    private TaskService taskService;
    @Autowired
    private WorkorderMapper workorderMapper;
    @Autowired
    private RuntimeService runtimeService;

    public String getTaskUrl(NodeDto nodeDto) {
        //List<TemplateAttribute>  templateAttributes = templateAttributeMapperExt.selectAllByTemplateId(nodeDto.getTemplateId());
        List<TemplateAttribute> templateAttributes = templateAttributeMapperExt.selectByTemplateIdAndRoleId(nodeDto.getTemplateId(), nodeDto.getRoleId());
        TemplateAttribute templateAttribute = templateAttributes.get(nodeDto.getExecuteOrder());
        return templateAttribute.getUrl();
    }

    public CallResponse<String> execute(WorkOrderProccessDto workOrderProccessDto) {
        //List<TemplateAttribute>  templateAttributes = templateAttributeMapperExt.selectAllByTemplateId(workOrderProccessDto.getWorkorder().getTemplateId());
        // List<TemplateAttribute>  templateAttributes = templateAttributeMapperExt.selectByTemplateIdAndRoleId(workOrderProccessDto.getWorkorder().getTemplateId(),workOrderProccessDto.getRoleId());
        //对外暴露一个监听端口，提供对指定的事件进行处理，譬如新建工单时，和审核时，需要额外的业务
        taskService.setWorkorderListener(new WorkorderListener() {
            @Override
            public boolean createWopkorder() {
                int i = workorderMapper.insert(workOrderProccessDto.getWorkorder());
                if (i > 0) {
                    return true;
                }
                return false;
            }

            @Override
            public boolean aduit() {
                return true;
            }

            @Override
            public boolean settleAccount() {
                return false;
            }
        });

        return CallResponse.success(taskService.complete(workOrderProccessDto).getMessage());

    }

    /* 方法实现说明
     * @author      admin
     * @param
     * @return
     * @throws
     * @date        2019/9/19 17:51
     * */
    public CallResponse<List<TemplateAttribute>> getTasks(@RequestBody NodeDto nodeDto) {
        return CallResponse.success(runtimeService.getTasks(nodeDto));
    }

    public CallResponse<String> getcomponent(@RequestBody NodeDto nodeDto) {

        return CallResponse.success(templateAttributeMapper.selectByPrimaryKey(nodeDto.getId()).getUrl());
    }

    public CallResponse<String> savecomponent(@RequestBody NodeDto nodeDto) {
        TemplateAttribute templateAttribute=new TemplateAttribute();
        templateAttribute.setId(nodeDto.getId());
        templateAttribute.setUrl(nodeDto.getUrl());
        templateAttributeMapperExt.updateUrlByPrimaryKey(templateAttribute);
        return CallResponse.success("模板保存成功");
    }
}
