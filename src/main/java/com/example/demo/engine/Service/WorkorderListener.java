package com.example.demo.engine.Service;
/**
 * @Description:    故障工单流程
 * @Author:         yc
 * @CreateDate:     2019/9/20 1:09
 * @UpdateUser:     yc
 * @UpdateDate:     2019/9/20 1:09
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public interface WorkorderListener {
    /**
     * 新建工单逻辑
     *@author      作者姓名
     *@param       * @param null
     * @return
     * @exception
     * @date      2019/9/20 1:09
     */
    public boolean createWopkorder();
    /**
     * 审核
     *@author      作者姓名
     *@param       * @param null
     * @return
     * @exception
     * @date      2019/9/20 1:10
     */
    public boolean aduit();
    /**
     * 结算
     *@author      作者姓名
     *@param       * @param null
     * @return
     * @exception
     * @date      2019/9/20 1:12
     */
    public boolean settleAccount();
}
