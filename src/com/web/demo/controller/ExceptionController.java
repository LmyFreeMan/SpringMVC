package com.web.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionController {
//    @ExceptionHandler
//    public String handleException(HttpServletRequest request,Exception ex){
//        request.setAttribute("ex",ex);
//        return "exception";
//    }
    @RequestMapping("/exception.do")
    public String exception(){
        System.out.println(1/0);
        return "index";
    }
}