package com.web.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class HelloWordController {
    @RequestMapping("/he31")
    public String index(){
        return "index";
    }
}