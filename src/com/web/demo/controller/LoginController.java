package com.web.demo.controller;
import com.web.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@Controller
public class LoginController {
    @RequestMapping("/login.do" )
    public String login(HttpServletRequest request, HttpServletResponse response){
            String username=request.getParameter("username");
            System.out.println(username);
            String password=request.getParameter("password");
            System.out.println(password);
            if("admin".equals(username)&&"admin".equals(password)){
                User user=new User();
                user.setUsername(username);
                user.setPhone("xx");
                System.out.println("登陆系统成功");
                //把用户信息放到当前的session会话中
                HttpSession session=request.getSession();
                session.setAttribute("user",user);
                return "index";
            }
            return "login";
    }
}