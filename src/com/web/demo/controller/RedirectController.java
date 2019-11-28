package com.web.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class RedirectController {
    @RequestMapping("/toRest")
    public String toRest(){
        return "restful";
    }
    @RequestMapping("/toLogin.do")
    public String toLogin(){
        return "login";
    }
    @RequestMapping("/toUser.do")
    public String addUser(){
        return "addUser";
    }
}