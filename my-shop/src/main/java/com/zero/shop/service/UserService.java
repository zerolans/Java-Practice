package com.zero.shop.service;

import com.zero.shop.entity.User;

public interface UserService {
    /**
     * @param userName
     * @param password
     */
    public User login(String userName, String password);

}
