package com.web.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@Controller
public class DownLoadController {
    @RequestMapping("/download.do")
    public String download(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        //获取文件id
        String id=httpServletRequest.getParameter("id");
        //获取文件路径
        String filePath="E://Java//Spring-MVC//web//upload//使用说明.txt";
        File file=new File(filePath);
        //获取文件名
        String fileName=file.getName();
        httpServletResponse.setContentType("application/octet-stream");
        httpServletResponse.addHeader("Content-Disposition","attachment;filename="+fileName);
        //获取文件的输入流
        InputStream in= null;
        try {
            in = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //获取文件的输出流
        OutputStream out= null;
        try {
            out = httpServletResponse.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte []b=new byte[1024];
        int lenth=0;
        while ((lenth=in.read(b))!=-1){
            out.write(b,0,b.length);
        }
        out.flush();
        out.close();
        in.close();
        return "index";
    }
}