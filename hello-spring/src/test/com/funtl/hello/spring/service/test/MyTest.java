package com.funtl.hello.spring.service.test;


import com.funtl.hello.spring.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    private static final Logger logger = LoggerFactory.getLogger(MyTest.class);

    public static void main(String []args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        UserService userService = (UserService)applicationContext.getBean("userService");
        userService.sayHi();

        logger.info("info 级别的日志");
        logger.debug("debug 级别的日志");
        logger.warn("warn 级别的日志");
        logger.error("error 级别的日志");

        String message = "message";
        logger.info("message is {}", message);

    }
}
