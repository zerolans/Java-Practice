package com.zero.login.demo.service;

import com.zero.login.demo.entity.User;

public interface UserService {
    public User login(String loginId, String pwd);
}
