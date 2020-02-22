package com.zero.shop.web;

import com.zero.shop.entity.User;
import com.zero.shop.service.Impl.UserServiceImpl;
import com.zero.shop.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        super.doGet(request, response);
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        UserService userService = (UserServiceImpl)context.getBean("UserService");
        String username = request.getParameter("username");
        String pass = request.getParameter("password");
        User admin = userService.login(username, pass);
        System.out.println(admin);

        if(admin != null){
            response.sendRedirect("/main.jsp");
        }
        else{
            request.setAttribute("message", "密码错误");
            request.getRequestDispatcher("index.jsp").forward(request, response);

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
