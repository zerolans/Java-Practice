package com.zero.login.demo.service.impl;

import com.zero.login.demo.dao.UserDao;
import com.zero.login.demo.dao.impl.UserDaoImpl;
import com.zero.login.demo.entity.User;
import com.zero.login.demo.service.UserService;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImpl();

    public User login(String loginId, String pwd) {
        return userDao.login(loginId, pwd);
    }
}
