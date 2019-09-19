package com.example.demo.constants;
/**
 * @Description:    定义返回值通用类型
 * @Author:         chenhaoran
 * @CreateDate:     2019/8/5 0005 上午 10:53
 * @UpdateUser:     chenhaoran
 * @UpdateDate:     2019/8/5 0005 上午 10:53
 * @UpdateRemark:   修改内容
 * @Version:        0.1
 */
public enum ResultConStant {
    SUCCESS("0000","成功"),
    FAILED("1111","失败"),
    RUNTINEFAILED("03-4-500","运行时异常"),
    SYSTEM_ERROR("04-4-001","系统异常"),
    INSERT_FAIL("1001","新增失败"),
    SELECT_WORK_TYPE_FAIL("2001","查询工单类型信息失败"),
    SELECT_WORKORDER_CODE_FAIL("2002","该设备未和工单编号关联，查询失败"),
    UPDATE_WORK_ORDER_IS_REMINDER("3001","催单失败！"),
    SELECT_FEE_FAIL("4001","获取字典费用值失败"),
    SELECT_PRO_PEOPLE_FAIL("5001","获取工单处理人信息失败"),
    SELECT_PRO_GROUP_FAIL("6001","获取工单处理用户组信息失败"),
    SELECT_CUSTOMER_FAIL("7001","获取employee信息失败"),
    ADMIN_WORK_ORDER_INSERT_SUCCESS("1","远程插入运维工单成功！"),
    ADMIN_WORK_ORDER_INSERT_FALI_PARAM("2","远程插入运维工单，参数异常！"),
    ADMIN_WORK_ORDER_INSERT_FALI_SYS("3","远程插入运维工单，远程接口异常！"),
    EMP_GET_ERROR("4","获取员工数据error")

    ;

    private String code;
    private String msg;

    ResultConStant(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static ResultConStant getByIndex(String code) {
        if (null == code) {
            return null;
        }
        for (ResultConStant errorConstants : values()) {

            if (errorConstants.getCode().equals(code)) {
                return errorConstants;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.getMsg();
    }

}
