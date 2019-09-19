package com.example.demo.engine.Service.impl;

import com.example.demo.dto.TemplateAttributeDto;
import com.example.demo.dto.WorkorderTemplateDto;
import com.example.demo.engine.Service.RepositoryService;
import org.springframework.stereotype.Service;


import java.util.List;
/**

* @Description:    存储组件

* @Author:         yc

* @CreateDate:     2019/9/14 16:24

* @UpdateUser:     yc

* @UpdateDate:     2019/9/14 16:24

* @UpdateRemark:   修改内容

* @Version:        1.0

*/
@Service
public class RepositoryServiceImpl implements RepositoryService {
    /**
     * 方法实现说明
     *@author      作者姓名
     *@param       * @param null
     * @return
     * @exception
     * @date      2019/9/20 0:41
     */
    @Override
    public int saveWorkOrderTemplate(WorkorderTemplateDto workorderTemplateDto) {
        return 0;
    }
    /**
     * 方法实现说明
     *@author      作者姓名
     *@param       * @param null
     * @return     
     * @exception 
     * @date      2019/9/20 0:42
     */
    @Override
    public boolean saveTemplateAttribute(WorkorderTemplateDto workorderTemplateDto, List<TemplateAttributeDto> templateAttributeDto) {
        return false;
    }
}
