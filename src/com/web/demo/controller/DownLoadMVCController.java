package com.web.demo.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.IOException;

@Controller
public class DownLoadMVCController {
    @RequestMapping("/down")
    public ResponseEntity<byte []> downLoad2(Integer id) throws IOException {
        String filePath="E://Java//Spring-MVC//web//upload//使用说明.txt";
        File file=new File(filePath);
        //获取文件名
        String fileName=file.getName();
        //设置HttpHeader
        HttpHeaders header=new HttpHeaders();
        //设置相应信息
        header.setContentDispositionFormData("Content-Disposition",fileName);
        //设置文件类型
        header.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        //把文件对象转化成字节数组
        byte [] data= FileUtils.readFileToByteArray(file);
        //把data字节数组通过构造器设置到ResponseEntity<byte []>对象中
        ResponseEntity<byte []> entity=new ResponseEntity<byte[]>(data,header, HttpStatus.CREATED);
        return entity;
    }
}