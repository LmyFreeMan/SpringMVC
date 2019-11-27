package com.web.demo.exception;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@Component
public class SpringMVCException implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        String xhr=httpServletRequest.getHeader("X-Requested-With");
        if(xhr!=null&&"XMLHttPRequest".equals(xhr)){
            try {
               PrintWriter out=httpServletResponse.getWriter();
               //json处理返回结果
                Map<String,Object> map=new HashMap<>();
                map.put("success",true);
                map.put("msg","请求异常，请联系管理员");
                ObjectMapper om=new ObjectMapper();
                om.writeValue(out,map);
               out.flush();
               out.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        ModelAndView mv=new ModelAndView("exception");
        mv.addObject("ex",e);
        return mv;
    }
}