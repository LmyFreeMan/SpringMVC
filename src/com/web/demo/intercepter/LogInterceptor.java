package com.web.demo.intercepter;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
public class LogInterceptor implements HandlerInterceptor {
    @Override
    //拦截到用户的请求，在用户的请求之前，先执行该方法
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("执行"+httpServletRequest.getRequestURI()+"请求时间"+new Date());
        //一定要return true才可以往下执行
        return true;
    }
    //执行用户的请求之后，再返回调用页面之前执行
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("执行完"+httpServletRequest.getRequestURI()+new Date());
    }
    //跳转到页面，页面信息渲染完毕之后回掉该方法
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("页面显示完"+httpServletRequest.getRequestURI()+new Date());
    }
}