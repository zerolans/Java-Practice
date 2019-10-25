package com.funtl.hello.spring.service.test;

import com.funtl.hello.spring.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

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
        String obj3 = "JUnit1";
        String obj4 = "JUnit1";
        String obj5 = null;
        int i1 = 1;
        int i2 = 1;
        int[] arithmetic1 = {1, 2, 3};
        int[] arithmetic2 = {1, 2, 3};

        assertEquals(obj1, obj2);

        assertSame(obj3, obj4);

        //obj3 和 obj4 是指向同一个引用的
        assertNotSame(obj3, obj1);

//        assertNotNull(obj5);
        assertNull(obj5);

        assertTrue("为真", i1 == i2);

        assertArrayEquals(arithmetic1, arithmetic2);
        
    }

    @After
    public void after(){
        System.out.println("关闭数据库连接");
    }
}
