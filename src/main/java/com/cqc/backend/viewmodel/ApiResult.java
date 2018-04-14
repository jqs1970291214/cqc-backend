package com.cqc.backend.viewmodel;

/**
 * author:Junqson
 * create:2018/4/13 23:28
 * des:
 */
public class ApiResult {
    private int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public ApiResult(int status) {
        this.status = status;
    }

    public static ApiResult ok(){
        return  new ApiResult(200);
    }
}

