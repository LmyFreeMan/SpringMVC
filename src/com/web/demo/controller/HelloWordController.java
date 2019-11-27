package com.web.demo.controller;

import org.springframework.stereotype.Controller;
@Controller
public class HelloWordController {
    public String index(){
        return "index";
    }
}