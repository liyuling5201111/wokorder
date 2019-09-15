package com.example.demo.engine;

import com.example.demo.engine.Service.RepositoryService;
import com.example.demo.engine.Service.RuntimeService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**

* @Description:    流程节点组建

* @Author:         yc

* @CreateDate:     2019/9/14 16:15

* @UpdateUser:     yc

* @UpdateDate:     2019/9/14 16:15

* @UpdateRemark:   修改内容

* @Version:        1.0

*/
@Component
@Data
public class ProcessEngineConfig {
   @Autowired
   RepositoryService repositoryService;
    @Autowired
    RuntimeService runtimeService;
}
