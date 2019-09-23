package com.example.demo.service;

import com.example.demo.dto.WorkOrderDto;
import com.example.demo.mapper.ext.WorkorderMapperExt;
import com.example.demo.mapper.ext.WorkorderProMapperExt;
import com.example.demo.pojo.Workorder;
import com.example.demo.pojo.WorkorderPro;
import com.example.demo.util.CallResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: admin
 * @CreateDate: 2019/9/19$ 12:02$
 * @UpdateUser: admin
 * @UpdateDate: 2019/9/19$ 12:02$
 * @UpdateRemark: 修改内容
 * @Version: 0.1
 */
@Service
public class WorkorderService {
    @Autowired
    private  WorkorderMapperExt workorderMapperExt;
    @Autowired
    private WorkorderProMapperExt workorderProMapperExt;
    public CallResponse<List<Workorder>> getWorkorders(WorkOrderDto workOrderDto){
        List<Workorder> workorders = workorderMapperExt.selectByUserIdWrcode(workOrderDto.getUserId(), workOrderDto.getWrstate());
      return  CallResponse.success(workorders);
    }

    public  CallResponse<List<WorkorderPro>> getWorkorderPros(String wrCode){
        List<WorkorderPro> workOrderPros = workorderProMapperExt.selectProByWrcode(wrCode);
        return  CallResponse.success(workOrderPros);
    }
}
