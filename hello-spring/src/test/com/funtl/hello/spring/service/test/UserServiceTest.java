package com.funtl.hello.spring.service.test;

import com.funtl.hello.spring.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;

public class UserServiceTest {
    UserService userService;
    @Before
    public void before(){
        System.out.println("初始化数据库链接");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        userService = (UserService) context.getBean("userService");
    }

    @Test
    public void testSayHi(){
        userService.sayHi();
    }

    @Test
    public void testSayHello(){
        userService.sayHello();
    }

    @Test
    public void testAssert(){
        String obj1 = "JUnit";
        String obj2 = "JUnit";

        assertEquals(obj1, obj2);
        
    }

    @After
    public void after(){
        System.out.println("关闭数据库连接");
    }
}
