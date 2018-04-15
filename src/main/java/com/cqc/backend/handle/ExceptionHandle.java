package com.cqc.backend.handle;

import com.cqc.backend.viewmodel.ApiResult;
import com.cqc.backend.viewmodel.MapResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * author:Junqson
 * create:2018/4/15 0:03
 * des: 统一异常处理
 */
@ControllerAdvice
public class ExceptionHandle {
    /**
     * 处理系统异常
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ApiResult handle(Exception e) {
        ApiResult apiResult = ApiResult.error();
        apiResult.setMsg(e.getMessage());
        return apiResult;
    }

    /*处理业务层异常*/
    public ApiResult handleServiceException(){
        return null;
    }

    /*处理接口数据和数据绑定异常*/
    public ApiResult handleDataException(){
        return null;
    }
}
