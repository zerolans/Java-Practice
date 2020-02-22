package com.zero.shop;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Log4jTest {
    @Test
    public void logTest(){
        Logger logger = LoggerFactory.getLogger("Log4jTest");
        logger.info("Log4jTest", "test");
    }
}
