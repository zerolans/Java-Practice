package com.zero.login.demo.dao;

import com.zero.login.demo.entity.User;

public interface UserDao {
    public User login(String loginId, String pwd);
}
