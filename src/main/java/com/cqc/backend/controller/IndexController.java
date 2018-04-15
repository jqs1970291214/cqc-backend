package com.cqc.backend.controller;

import com.cqc.backend.service.UserService;
import com.cqc.backend.viewmodel.ApiResult;
import com.cqc.backend.viewmodel.MapResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author:Junqson
 * create:2018/4/13 23:12
 * des:
 */

@Controller
public class IndexController {
    @RequestMapping(path = {"/","index"})
    public String index(){
        return "index";
    }

    @RequestMapping("/admin")
    public String admin(@RequestParam("pass") String password){
        if("chuangqingchun".equals(password)) {
            return "admin";
        }else {
            return "error";
        }
    }
    @RequestMapping("/token")
    @ResponseBody
    public String getToken(){
        String token = "I am token";
        String result = "var token = '";
        result += token;
        result += "'; alert(token);";
        return result;

    }

}
