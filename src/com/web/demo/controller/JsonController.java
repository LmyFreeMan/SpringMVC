package com.web.demo.controller;
import com.web.demo.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class JsonController {
    @RequestMapping("/tojson")
    public String toJsp(){
        return "json";
    }
    @RequestMapping("/toBean")
    @ResponseBody
    public Student toBean(@RequestBody  Student student){
           return student;
    }
    //把janabean对象转成json字符串
    @ResponseBody
    @RequestMapping("/pojo")
   public  Student getStudent(){
        Student student=new Student();
        student.setClassId(2);
        student.setStuName("xx6");
        student.setStuNo(5);
        return student;
   }
    @ResponseBody
    @RequestMapping("/map")
   public Map<String,Object> map(){
        Map<String,Object> map=new HashMap<>();
        map.put("id",1);
        map.put("username","admin");
        Student student=new Student();
        student.setClassId(2);
        student.setStuName("xx6");
        student.setStuNo(5);
        map.put("student",student);
        return map;
        }
    @ResponseBody
    @RequestMapping("/list")
        public List<Object> list(){
            List<Object> list=new ArrayList<>();
            Student student=new Student();
            student.setClassId(2);
            student.setStuName("xx6");
            student.setStuNo(5);
            list.add(student);
            return  list;
        }
   }