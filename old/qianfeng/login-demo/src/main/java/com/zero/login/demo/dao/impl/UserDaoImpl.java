package com.zero.login.demo.dao.impl;

import com.zero.login.demo.dao.UserDao;
import com.zero.login.demo.entity.User;

public class UserDaoImpl implements UserDao {
    public User login(String loginId, String pwd) {
        User user = null;
        if ("admin".equals(loginId)){
            if ("admin".equals(pwd)){
                user = new User();
                user.setLoginId(loginId);
                user.setPassword(pwd);
                user.setUserName("zero");
                return user;
            }
        }
        return null;
    }
}
