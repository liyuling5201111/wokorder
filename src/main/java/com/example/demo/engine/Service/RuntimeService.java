package com.example.demo.engine.Service;

import com.example.demo.dto.NodeDto;
import com.example.demo.pojo.TemplateAttribute;

import java.util.List;

/**

* @Description:    运行时服务组件

* @Author:         yc

* @CreateDate:     2019/9/14 18:44

* @UpdateUser:     yc

* @UpdateDate:     2019/9/14 18:44

* @UpdateRemark:   修改内容

* @Version:        1.0

*/
public interface RuntimeService {
    public List<TemplateAttribute> getTasks(NodeDto nodeDto);
}
