package com.zero.shop.dao.Impl;

import com.zero.shop.dao.UserDao;
import com.zero.shop.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {
    Logger logger = null;

    public User getUser(String email, String pass) {
        if(logger == null){
            logger = LoggerFactory.getLogger("UserDaoImpl");
        }
        logger.debug("调用 getUser(), email:{} password:{}", email, pass);
        User user = null;
        if ("admin@zero.com".equals(email)){
            if ("admin".equals(pass)){
                user = new User(email, pass);
                logger.debug("成功获取用户“{}”的信息", email);
            }
        }else{
            logger.warn("获取“{}”的用户信息失败", email);
        }
        return user;
    }
}
