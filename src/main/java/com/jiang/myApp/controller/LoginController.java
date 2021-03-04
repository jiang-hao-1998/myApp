package com.jiang.myApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class LoginController {
    @RequestMapping("login")
    String login(){
        return "登录成功";
    }
}
