package com.zero.shop.dao;

import com.zero.shop.entity.User;

public interface UserDao {

    public User getUser(String userName, String pass);
}
