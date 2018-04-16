package com.cqc.backend.viewmodel;

import java.util.HashMap;
import java.util.Map;

/**
 * author:Junqson
 * create:2018/4/13 23:28
 * des:
 */
public class ApiResult {

    private int status;
    private String msg;
    private Map<String, Object> data;

    public ApiResult() {
        this.status = 0;
        this.msg = null;
        this.data = new HashMap<String,Object>();
    }

    public ApiResult(int status) {
        this.status = status;
        this.msg = null;
        this.data = new HashMap<String,Object>();

    }

    public ApiResult(int status, String msg) {
        this.status = status;
        this.msg = msg;
        this.data = new HashMap<String,Object>();
    }

    public void put(String key, Object object) {
        data.put(key, object);
    }

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

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}

