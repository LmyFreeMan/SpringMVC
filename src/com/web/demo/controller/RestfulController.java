package com.web.demo.controller;

import com.web.demo.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@ResponseBody
@RestController
public class RestfulController {
    //查询用户信息
    @GetMapping("/users/{id}")
    public Map<String,Object> search(@PathVariable("id") int id){
        Map<String,Object> map=new HashMap<>();
        map.put("success",true);
        map.put("msg","修改成功");
        return map;
    }

    //添加用户信息
    @PostMapping("/users")
    public Map<String,Object> add(User user){
        Map<String,Object> map=new HashMap<>();
        map.put("success",true);
        map.put("msg","修改成功");
        return map;
    }

    //编辑用户信息
    @PutMapping("/users/{id}")
    public Map<String,Object> edit(User user, @PathVariable("id") int id){
        System.out.println(id);
        Map<String,Object> map=new HashMap<>();
        map.put("success",true);
        map.put("msg","修改成功");
        return map;
    }

    //删除用户信息
    @DeleteMapping ("/users/{id}")
    public Map<String,Object> delete(@PathVariable("id") int id,User user){
        System.out.println("删除成功");
        Map<String,Object> map=new HashMap<>();
        map.put("success",true);
        map.put("msg","修改成功");
        return map;
    }
}