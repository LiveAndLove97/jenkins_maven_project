package com.gjl.jenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @ClassName LoginController
 * @Description TODO
 * @Author 暗影
 * @Date 2021/8/31 10:32
 * @Version 1.0
 **/
@Controller
public class LoginController {
    @GetMapping("/")
    String Login() {
        return "welcome";
    }
}
