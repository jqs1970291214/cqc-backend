package com.cqc.backend.viewmodel;

/**
 * author:Junqson
 * create:2018/4/13 23:33
 * des:
 */
public class ApiError extends ApiResult{
    private String message;
    public ApiError(String message, int status) {
        super(status);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
