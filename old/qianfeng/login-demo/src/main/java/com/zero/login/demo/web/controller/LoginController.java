package com.zero.login.demo.web.controller;

import com.zero.login.demo.entity.User;
import com.zero.login.demo.service.UserService;
import com.zero.login.demo.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginController extends HttpServlet {
    UserService userService;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String loginId = req.getParameter("loginId");
        String password = req.getParameter("password");

        userService = new UserServiceImpl();
        User user = userService.login(loginId, password);

        //登录成功
        if (user == null){
            req.getRequestDispatcher("/fail.jsp").forward(req, resp);
        }

        //登录失败
        else{
            req.getRequestDispatcher("success.jsp").forward(req, resp);
        }

    }
}
