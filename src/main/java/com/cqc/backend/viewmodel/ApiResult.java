package com.cqc.backend.viewmodel;

/**
 * author:Junqson
 * create:2018/4/13 23:28
 * des:
 */
public class ApiResult {

    private int status;
    private String msg;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ApiResult(int status) {
        this.status = status;
    }

    public static ApiResult ok() {
        return new ApiResult(200, "success");
    }

    public static ApiResult error() {
        return new ApiResult(404, "error");
    }

    public ApiResult(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }
}

