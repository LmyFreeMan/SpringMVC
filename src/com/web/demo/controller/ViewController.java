package com.web.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
* 请求处理的返回值
* String类型=jsp页面名称
* void类型=返回RequestMapping映射路径，与url相同的jsp页面
* ModelAndView类型:可以在ModelAndView对象中设置数据模型和视图页面
* Model类型或者ModeMap类型:Model类型返回和url相同的jsp页面
* 跳转和重定向
* redirect:重定向
* forward：跳转
*
* */
@Controller
public class ViewController {
    @RequestMapping("/modelAndView")
    public ModelAndView m(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("index");//设置视图页面
        mv.addObject("username","admin");
        return mv;
    }
    @RequestMapping("/models")
    public Model model(Model model){
        model.addAttribute("username","李四");
        return model;
    }
    //重定向
    @RequestMapping("/redirect")
    public String redirect(){
        return "redirect:string.do";
    }
    @RequestMapping("/forward")
    public String forward(){
        return "forward:string.do";
    }
}
