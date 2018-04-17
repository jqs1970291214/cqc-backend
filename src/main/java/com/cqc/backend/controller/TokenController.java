
package com.cqc.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.qiniu.util.Auth;

@Controller
public class TokenController {
    @RequestMapping("/uptoken")
    @ResponseBody
    public String uptoken(){
        String accessKey = "T9Du02GF9lmJYw8uZbAZENKRGes7F7SL9oQWCCLR";
        String secretKey = "2t5iRSfiUlCJLEJSCFOLKv_ZurmMliQoIFZgbXGe";
        String bucket = "sdcqc";

        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);
        /*String result = "var uptoken ="+ "\""+upToken+"\"";*/
        return upToken;
    }

}
