package com.meiyukai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/hello")
public class LoginController {
    @PostMapping(value = "/login")
    public void login(@RequestParam(value = "username") String usrname ,   @RequestParam(value = "passwd") String passwd ){
        System.out.println("usrname  =  "+ usrname  + "    " +  "passwd   =  "+ passwd );
    }

}
