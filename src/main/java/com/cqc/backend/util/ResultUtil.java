package com.cqc.backend.util;

import com.cqc.backend.viewmodel.ApiResult;

import java.util.Map;

/**
 * author:Junqson
 * create:2018/4/15 0:33
 * des: 处理result集
 */
public class ResultUtil {
    /**
     * 默认成功
     * @return
     */
    public static ApiResult success() {
        ApiResult result = new ApiResult();
        result.setStatus(ResultEnum.SUCCESS.getStatus());
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        return result;
    }

    /**
     * 携带数据的成功
     * @param data
     * @return
     */
    public static ApiResult success(Map<String,Object> data) {
        ApiResult result = ResultUtil.success();
        result.setData(data);
        return result;
    }

    /**
     * 默认错误
     * @return
     */
    public static ApiResult error() {
        ApiResult result = new ApiResult();
        result.setStatus(ResultEnum.UNKNOWN_ERROR.getStatus());
        result.setMsg(ResultEnum.UNKNOWN_ERROR.getMsg());
        return result;
    }

    /**
     * 其他错误
     * @param resultEnum
     * @return
     */
    public static ApiResult error(ResultEnum resultEnum) {
        ApiResult result = new ApiResult();
        result.setStatus(resultEnum.getStatus());
        result.setMsg(resultEnum.getMsg());
        return result;
    }

}
