package com.cqc.backend.handle;

import com.cqc.backend.exception.MyException;
import com.cqc.backend.util.ResultUtil;
import com.cqc.backend.viewmodel.ApiResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * author:Junqson
 * create:2018/4/15 0:03
 * des: 统一异常处理
 */
@ControllerAdvice
public class ExceptionHandle {

     Logger logger = LoggerFactory.getLogger(Exception.class);
    /**
     * 处理业务层异常
     * @return
     *//*
    @ExceptionHandler(value = MyException.class)
    public ApiResult handleServiceException(MyException e){
        ApiResult apiResult = ResultUtil.error();
        apiResult.setMsg(e.getMessage());
        return apiResult;
    }
*/

    /**
     * 处理系统异常
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ApiResult handle(Exception e) {
        ApiResult apiResult = ResultUtil.error();
        if (e instanceof MyException) {
            apiResult.setMsg(e.getMessage());
        } else {
           // e.printStackTrace(); //输出到控制台或者记录日志，否则会丢失异常信息
            logger.error("系统异常[] {}",e.getMessage());
        }
        return apiResult;


    }



    /*处理接口数据和数据绑定异常*/
    public ApiResult handleDataException(){
        return null;
    }
}
