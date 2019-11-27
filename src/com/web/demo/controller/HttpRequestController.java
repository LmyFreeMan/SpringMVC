package com.web.demo.controller;

import com.web.demo.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
@RequestMapping("/http")
public class HttpRequestController {
    /*
     * 默认支持的参数类型举例
     * Servlet API类型 HttpServletRequest，HttpServletResponse
     * Model,ModelMap基于map接口类型的
     * 自定义类型entity类bean,String
     * 基于流处理类型
     * 基本数据类型 int,float,float,long
     * @RequestParam用于绑定参数，在形参的括号中指明参数的别名。用于更精确的定位处理器的方法
     * 绑定pojo对象(必须定义一个bean,把bean作为控制器处理方法的参数，jsp页面上定义字段名称要与bean的属性一致，只有都一致的情况下才能自动绑定)
     * 通过@PathVariable将url中占位符对应的值绑定到请求处理方法的形参上
     * 通过cookieValue将cookie的值绑定到请求处理方法的形参上
     * 通过@RequestHeader将请求头信息对应的值绑定请求处理方法形参上
     * */
    @RequestMapping("/index")
    public String requestMethod(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap){
        modelMap.put("key1","value");
        System.out.println(request.getParameter("username"));
        return "index";
}
    @RequestMapping("/string")
    public String string(String username){
    System.out.println(username);
    return "index";
    }
    @RequestMapping("/para")
//    @RequestParam用于绑定参数，在形参的括号中指明参数的别名。用于更精确的定位处理器的方法
    public String para(@RequestParam(value="username",defaultValue = "li") String user){
        System.out.println(user);
        return "index";
    }
    @RequestMapping("/toStu")
    public String toStu(){
        return "student";
    }
    @RequestMapping("/stuRegister")
    public String stuRegister(Student student){
        System.out.println(student);
        return "index";
    }
    //占位符表示
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
          System.out.println(id);
          return null;
    }
}