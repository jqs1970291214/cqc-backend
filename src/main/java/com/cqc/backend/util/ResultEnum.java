package com.cqc.backend.util;

import org.omg.CORBA.UNKNOWN;

/**
 * author:Junqson
 * create:2018/4/15 0:23
 * des: 枚举状态码与原因
 */
public enum ResultEnum {

    SUCCESS(200,"success"),
    UNKNOWN_ERROR(400,"error"),
    NOT_FOUND(401,"not found"),
    RECORD_EXISTS(402,"record exists"),
    PARAM_EMPTY(403,"param is empty"),
    LOGIN_REQUIRED(404,"you need to log in first");

    private Integer status;
    private String msg;

    ResultEnum(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
