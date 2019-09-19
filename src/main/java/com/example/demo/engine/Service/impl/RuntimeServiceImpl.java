package com.example.demo.engine.Service.impl;

import com.example.demo.dto.NodeDto;
import com.example.demo.engine.Service.RuntimeService;
import com.example.demo.mapper.ext.TemplateAttributeMapperExt;
import com.example.demo.pojo.TemplateAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**

* @Description:    运行流程组件

* @Author:         yc

* @CreateDate:     2019/9/14 16:23

* @UpdateUser:     yc

* @UpdateDate:     2019/9/14 16:23

* @UpdateRemark:   修改内容

* @Version:        1.0

*/
@Service
public class RuntimeServiceImpl implements RuntimeService {
    @Autowired
    TemplateAttributeMapperExt templateAttributeMapperExt;
    /**
     * 获取所有节点信息
     *@author      作者姓名
     *@param       * @param null
     * @return
     * @exception
     * @date      2019/9/20 0:42
     */
    @Override
    public List<TemplateAttribute> getTasks(NodeDto nodeDto) {
        return templateAttributeMapperExt.selectByTemplateIdAndRoleId(nodeDto.getTemplateId(),nodeDto.getRoleId());
    }
}