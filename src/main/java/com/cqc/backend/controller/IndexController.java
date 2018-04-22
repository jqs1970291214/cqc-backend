package com.cqc.backend.controller;

import com.cqc.backend.exception.MyException;
import com.cqc.backend.util.ResultEnum;
import com.cqc.backend.util.ResultUtil;
import com.cqc.backend.viewmodel.ApiResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * author:Junqson
 * create:2018/4/13 23:12
 * des:
 */

@Controller
public class IndexController {

    /**
     * 模板首页
     */
    @RequestMapping(path = {"/","index"})
    public String index(HttpSession session){
        //验证已登录状态
        if (session.getAttribute("login") == "ok") return "admin";
        return "index";
    }

    @RequestMapping(value = "login")
    @ResponseBody
    public ApiResult login(@RequestParam(value = "pwd",required = false,defaultValue = "#") String password, HttpSession session){
        ApiResult result = ResultUtil.success();
        //默认session过期时间为30min
        if("chuangqingchun".equals(password)) {
            session.setAttribute("login","ok");
            return result;
        } else {
            //输错密码自动下线
            session.setAttribute("login","notok");
            return ResultUtil.error(ResultEnum.PASS_ERROR);
        }
    }

    @RequestMapping("/status")
    @ResponseBody
    public ApiResult test(HttpSession session){
        Object code = session.getAttribute("login");
        if(code == null || !"ok".equals(code.toString())){
            return ResultUtil.error(ResultEnum.LOGIN_REQUIRED);
        } else {
            return ResultUtil.success();
        }
    }


    /**
     * 管理首页
     */
    @RequestMapping("/admin")
    public String admin(){
        return "admin";
    }

    @RequestMapping("/del")
    public String del(){
        return "del";
    }


}
