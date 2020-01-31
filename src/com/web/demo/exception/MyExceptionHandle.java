//package com.web.demo.exception;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.ModelAndView;
//
///*
//*
//*专门处理各种异常
//*
//* */
////@ControllerAdvice
//public class MyExceptionHandle {
//    //捕获ArithmeticException异常
//   // @ExceptionHandler({Exception.class})
//    @ResponseBody
//    public ModelAndView customException(Exception e) {
//        System.out.println(66);
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("index");
//        return mv;
//    }
//
//}