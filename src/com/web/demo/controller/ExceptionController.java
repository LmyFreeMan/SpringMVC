package com.web.demo.controller;
import com.web.demo.exception.ResponseStatusDemo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/*
 * 通过@ExceptionHandler注解处理异常
 * 如果有多个方法抛出异常，则就近原则。
 * */
@Controller
public class ExceptionController {
    @RequestMapping("testException")
    public String handleException(HttpServletRequest request, Exception ex) {
        request.setAttribute("ex", ex);
        return "exception";
    }

    @RequestMapping("/exception.do")
    public String exception() {
        System.out.println(1 / 0);
        return "index";
    }

    @RequestMapping("testMyexception")
    public String  testMyexception(@RequestParam("i") Integer id) throws ResponseStatusDemo {
        if(id==3){
            throw  new ResponseStatusDemo();
        }

        return "index";
    }
}