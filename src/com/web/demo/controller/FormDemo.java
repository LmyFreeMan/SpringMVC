package com.web.demo.controller;

import com.web.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class FormDemo {
    @RequestMapping("/formDemo")
    public String testDemo(Map<String,User> map){
         return "index";
    }
}