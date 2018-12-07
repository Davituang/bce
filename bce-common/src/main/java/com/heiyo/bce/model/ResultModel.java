package com.heiyo.bce.model;

import com.heiyo.bce.constant.Constant;
import org.slf4j.MDC;

import java.io.Serializable;

public class ResultModel<T> implements Serializable {

    private static final long serialVersionUID = -1093531160209602632L;

    private static final String SUCCESS_MESSAGE = "处理成功";

    private static final String SUCCESS_CODE = "000000";

    private String Message = SUCCESS_CODE;

    private String Code = SUCCESS_CODE;

    private String HostId;

    private String RequestId;

    private T date;

    public ResultModel() {
        this.RequestId = MDC.get(Constant.HTTP_REQEUST_ID);
    }

    public ResultModel(String code, String message) {
        Message = message;
        Code = code;
        this.RequestId = MDC.get(Constant.HTTP_REQEUST_ID);
    }

    public ResultModel(T date) {
        this.date = date;
        this.RequestId = MDC.get(Constant.HTTP_REQEUST_ID);
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getHostId() {
        return HostId;
    }

    public void setHostId(String hostId) {
        HostId = hostId;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }
}
