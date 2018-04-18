package com.cqc.backend.controller;

import com.cqc.backend.service.UserService;
import com.cqc.backend.util.ResultUtil;
import com.cqc.backend.viewmodel.ApiResult;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Enumeration;

/**
 * author:Junqson
 * create:2018/4/13 23:12
 * des:
 */

@Controller
public class IndexController {

    /**
     * 模板首页
     * @return
     */
    @RequestMapping(path = {"/","index"})
    public String index(){
        return "index";
    }



    @RequestMapping("/admin")
    public String admin(@RequestParam("pass") String password, HttpSession session, Model model){
        /*session.removeAttribute("login");*/
        ApiResult apiResult = ResultUtil.success();
        if("chuangqingchun".equals(password)) {
            session.setAttribute("login","ok");
            return "admin";
        } else {
            session.setAttribute("login","notok");
            apiResult.setStatus(400);
            apiResult.setMsg("pass is wrong");
            model.addAttribute("result",apiResult);
            return "error";
        }


    }
  /*  @RequestMapping("/token")
    @ResponseBody
    public String getToken(){
        String token = "I am token";
        String result = "var token = '";
        result += token;
        result += "'; alert(token);";
        return result;

    }
*/
}
