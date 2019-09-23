package com.example.demo.controller;

import com.example.demo.dto.NodeDto;
import com.example.demo.dto.WorkOrderDto;
import com.example.demo.dto.WorkOrderProccessDto;
import com.example.demo.engine.Entity.Task;
import com.example.demo.engine.Service.TaskService;
import com.example.demo.pojo.TemplateAttribute;
import com.example.demo.pojo.Workorder;
import com.example.demo.service.StrartProcessService;
import com.example.demo.service.WorkorderService;
import com.example.demo.util.CallResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@Controller
@Api(value = "流程节点执行")
public class StartProcessController {
    @Autowired
    StrartProcessService strartProcessService;
    @Autowired
    TaskService taskService;
    @Autowired
    WorkorderService workorderService;

    @PostMapping("/gettaskurl")
    @ApiOperation(value = "获取节点中的url", notes = "新增之后返回对象")
    @ApiImplicitParam(paramType = "getTaskUrl", name = "nodeDto", value = "获取url", required = true, dataType = "NodeDto")
    @ApiResponse(code = 400, message = "参数没有填好", response = String.class)
    @ResponseBody
    public String getTaskUrl(@RequestBody NodeDto nodeDto) {

        return strartProcessService.getTaskUrl(nodeDto);
    }

    @PostMapping("/executetask")
    @ApiOperation(value = "执行流程节点", notes = "流程执行后返回的对象")
    @ApiImplicitParam(paramType = "WorkOrderProccessDto", name = "workOrderProccessDto", value = "流程节点", required = true, dataType = "WorkOrderProccessDto")
    @ApiResponse(code = 400, message = "参数没有填好", response = Task.class)
    @ResponseBody
    public CallResponse<String> execute(@RequestBody WorkOrderProccessDto workOrderProccessDto) {
        return strartProcessService.execute(workOrderProccessDto);
    }

    @PostMapping("/getNodesByTemplateId")
    @ApiOperation(value = "获取节点中的url", notes = "新增之后返回对象")
    @ApiImplicitParam(paramType = "getTaskUrl", name = "nodeDto", value = "获取url", required = true, dataType = "NodeDto")
    @ApiResponse(code = 400, message = "参数没有填好", response = String.class)
    @ResponseBody
    public String getNodes(@RequestBody NodeDto nodeDto) {

        return strartProcessService.getTaskUrl(nodeDto);
    }


    @PostMapping("/getnodes")
    @ApiOperation(value = "获取所有流程节点", notes = "返回所有流程节点")
    @ApiImplicitParam(paramType = "NodeDto", name = "nodeDto", value = "流程节点", required = true, dataType = "NodeDto")
    @ApiResponse(code = 400, message = "参数没有填好", response = Task.class)
    @ResponseBody
    public CallResponse<List<TemplateAttribute>> getnodes(@RequestBody NodeDto nodeDto) {
        return strartProcessService.getTasks(nodeDto);
    }

    @PostMapping("/getworkorders")
    @ApiOperation(value = "获取所有流程节点", notes = "返回所有流程节点")
    @ApiImplicitParam(paramType = "NodeDto", name = "nodeDto", value = "流程节点", required = true, dataType = "NodeDto")
    @ApiResponse(code = 400, message = "参数没有填好", response = Task.class)
    @ResponseBody
    public CallResponse<List<Workorder>> getWorkorders(@RequestBody WorkOrderDto workOrderDto) {
        return workorderService.getWorkorders(workOrderDto);
    }

    /*
     * 获取模板
     * @author      admin
     * @param
     * @return
     * @throws
     * @date        2019/9/23 10:45
     * */
    @PostMapping("/getcomponent")
    @ResponseBody
    public CallResponse<String> getcomponent(@RequestBody NodeDto nodeDto) {
        return strartProcessService.getcomponent(nodeDto);
    }


    /*
     * 模板保存
     * @author      admin
     * @param       [nodeDto]
     * @return     com.example.demo.util.CallResponse<java.lang.String>
     * @throws
     * @date        2019/9/23 10:46
     * */
    @PostMapping("/savecomponent")
    @ResponseBody
    public CallResponse<String> savecomponent(@RequestBody NodeDto nodeDto) {
        return strartProcessService.savecomponent(nodeDto);
    }
}