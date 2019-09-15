package com.example.demo.dto;

import com.example.demo.pojo.Workorder;
import com.example.demo.pojo.WorkorderPro;
import lombok.Data;

@Data
public class WorkOrderProccessDto {
    private int userId;
    private String adderss;
    private WorkorderPro workorderPro;
    private Workorder workorder;
}
