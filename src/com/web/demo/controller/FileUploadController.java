package com.web.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class FileUploadController {
    @RequestMapping("/toFile")
    public String toFile(){
        return "upload";
    }
    @RequestMapping("/upload")
    public String upLoad(@RequestParam  MultipartFile file){
        //获取文件名
        String fileName=file.getOriginalFilename();
        if(!file.isEmpty()){
            try {
                file.transferTo(new File("E://Java//Spring-MVC//web//upload/",fileName));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "index";
    }
}