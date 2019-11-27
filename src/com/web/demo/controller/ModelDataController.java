package com.web.demo.controller;

import com.web.demo.entity.Student;
import com.web.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
@RequestMapping("/data")
@SessionAttributes("user")
@Controller
public class ModelDataController {
    /*
    *@ModelAttribute可以定义在方法上和请求处理方法的形式参数前
    * 在方法前面上使用@ModelAttribute注解，SpringMVC在调用目标请求处理方法前面，会先逐个调用在方法级上标注的@ModelAttribute方法
    * 在方法的形式参数前使用@ModelAttribute注解，可以从模型数据中获取对象，再将请求参数绑定到对象中，然后再将对象绑定到方法形参上
    * 将方法入参对象添加到模型中
    * @SessionAttributes除了可以通过属性名指定需要放到会话中的属性外，还可以通过模型属性的对象类型指定哪些模型属性需要放到会话中
    * */
    @RequestMapping("/model")
    public String model(@ModelAttribute("student") Student student){
            System.out.println(student);
             return "index";
    }

    @RequestMapping("/findById")
    public String findById(User user){
        if(user==null)
            user=new User();
        user.setId(1);
        user.setUsername("admin");
        user.setPhone("65565656");
        System.out.println(user);
        return "index";
    }
    @RequestMapping("/detail")
    public String detail(User user){
        System.out.println(user);
        return "index";
    }

}