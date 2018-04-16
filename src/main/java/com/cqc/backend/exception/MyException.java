package com.cqc.backend.exception;

import com.cqc.backend.util.ResultEnum;

/**
 * author:Junqson
 * create:2018/4/15 0:40
 * des: 处理业务层异常
 */
public class MyException extends RuntimeException {

    private Integer status;

    public MyException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.status = resultEnum.getStatus();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
