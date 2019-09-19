package com.example.demo.util;

import com.example.demo.constants.ResultConStant;

/**
 * @Description: 公共通用返回类
 * @Author: liyulin
 * @CreateDate: 2019/8/5 9:39
 * @UpdateUser: liyulin
 * @UpdateDate: 2019/8/5 9:39
 * @UpdateRemark: 修改内容
 * @Version: 0.1
 */

public class CallResponse<T> {
    /**
     * required
     */
    private String code;
    /**
     * required
     */
    private String message;
    private T result;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    private CallResponse(T result) {
        this.result = result;
    }

    private CallResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }

    private CallResponse(String code, String message, T result) {
        this.code = code;
        this.message = message;
        this.result = result;
    }

    /**
     * 需要返回成功时候调用
     *
     * @param [result]
     * @return com.snbc.smcp.workorder.customerservice.util.CallResponse<T>
     * @throws
     * @author liyulin
     * @date 2019/8/5 9:41
     */
    public static <T> CallResponse<T> success(T result) {

        return new CallResponse<T>(ResultConStant.SUCCESS.getCode(), ResultConStant.SUCCESS.getMsg(), result);
    }

    /**
     * 当返回业务失败时，需要额外的增加额外的code和msg
     * @author      admin
     * @param       [code, message]
     * @return     com.snbc.smcp.workorder.customerservice.util.CallResponse<T>
     * @throws
     * @date        2019/8/5 9:42
     * */
    public static <T> CallResponse<T> error(String code, String message) {
        return new CallResponse<T>(code, message);
    }

    /**
     * 用于返回业务失败
     * @author      admin
     * @param       [message]
     * @return     com.snbc.smcp.workorder.customerservice.util.CallResponse<T>
     * @throws
     * @date        2019/8/5 9:43
     * */
    public static <T> CallResponse<T> error(String message) {
        return new CallResponse<T>(ResultConStant.FAILED.getCode(), message);
    }

    public CallResponse() {
        super();
    }

}