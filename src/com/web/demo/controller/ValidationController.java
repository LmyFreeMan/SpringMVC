package com.web.demo.controller;

import com.web.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
@Controller
public class ValidationController {
    @RequestMapping("/toUser.do")
    public String addUser(){
        return "addUser";
    }
    @RequestMapping("/addUser.do")
    public String save(@Valid User user, Errors errors, Model model){
        if(errors.hasErrors()){
            model.addAttribute("errors",errors);
            return "errors";
        }
        return "index";
    }

}