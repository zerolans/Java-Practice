package com.zero.shop.service.Impl;

import com.zero.shop.CommonUtil.context.SpringContext;
import com.zero.shop.dao.Impl.UserDaoImpl;
import com.zero.shop.dao.UserDao;
import com.zero.shop.entity.User;
import com.zero.shop.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;


@Service(value = "userService")
public class UserServiceImpl implements UserService {
    Logger logger = null;


    public User login(String userName, String password) {
        if (logger == null){
            logger = LoggerFactory.getLogger(UserServiceImpl.class);
        }
        logger.debug("调用 UserService 的 login 方法");
        UserDao userDao = SpringContext.getBean("userDao");
        return userDao.getUser(userName, password);
    }
}
