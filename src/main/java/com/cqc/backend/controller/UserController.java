package com.cqc.backend.controller;

import com.cqc.backend.model.UserInfo;
import com.cqc.backend.service.UserService;
import com.cqc.backend.viewmodel.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * author:Junqson
 * create:2018/4/14 1:11
 * des:
 */
/*
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/adduser")
    @ResponseBody
    public ApiResult addUser(@RequestParam("user") String user, @RequestParam("pwd") String pwd) {
        MapResult mapResult = new MapResult();
        if(user.isEmpty() && pwd.isEmpty()) {
            mapResult.put("messge","user or pwd is empty");
            mapResult.setStatus(404);
            return mapResult;
        }
        userService.createNewAccount(user,pwd);
        mapResult.put("message","success!");
        return mapResult;
    }

    @RequestMapping("/getuser")
    @ResponseBody
    public ApiResult getUser(@RequestParam("user") String user){
        MapResult mapResult = new MapResult();
        UserInfo userInfo = null;
        if (!user.isEmpty()) userInfo = userService.getUser(user);
        if(userInfo != null) {
            mapResult.put("userinfo",userInfo);
            mapResult.put("message","user found");
        } else {
            mapResult.setStatus(404);
            mapResult.put("message", "user not found");
        }

        return mapResult;
    }
}
*/
