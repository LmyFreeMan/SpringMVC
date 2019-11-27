package com.web.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
public class TestController {
    @RequestMapping("/test.do")
    public String test(){
        return "index";
    }
}