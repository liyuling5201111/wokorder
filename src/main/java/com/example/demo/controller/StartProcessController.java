package com.example.demo.controller;

import com.example.demo.dto.NodeDto;
import com.example.demo.dto.WorkOrderProccessDto;
import com.example.demo.engine.Entity.Task;
import com.example.demo.engine.Service.TaskService;
import com.example.demo.service.StrartProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StartProcessController {
    @Autowired
    StrartProcessService strartProcessService;
    @Autowired
    TaskService taskService;

    @PostMapping("/gettaskurl")
    @ResponseBody
    public String getTaskUrl(@RequestBody NodeDto nodeDto) {

        return strartProcessService.getTaskUrl(nodeDto);
    }

    @PostMapping("/executetask")
    @ResponseBody
    public Task execute(@RequestBody WorkOrderProccessDto workOrderProccessDto) {

        return  strartProcessService.execute( workOrderProccessDto);

    }
}
