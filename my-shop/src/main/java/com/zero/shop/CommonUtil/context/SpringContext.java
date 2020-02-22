package com.zero.shop.CommonUtil.context;


import com.sun.media.jfxmediaimpl.MediaDisposer;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringContext implements ApplicationContextAware, DisposableBean {
    private static ApplicationContext context;
    private Logger logger = LoggerFactory.getLogger("spring-context");


    public static ApplicationContext getApplicationContext(){
        assertContextInjected();
        return context;
    }

    /**
     * 从静态变量 applicationContext 中获取 Bean，自动转型成所赋值对象类型
     * @param name
     * @param <T>
     */
    public static <T> T getBean(String name){
        assertContextInjected();
        return (T) context.getBean(name);
    }

    /**
     * 从静态变量 applicationContext 中获取 Bean，自动转型成所赋值对象类型
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T getBean(Class<T> clazz){
        assertContextInjected();
        return (T) context.getBean(clazz);
    }

    /**
     * 实现 Disposable 接口，在 Context 关闭时清理静态变量
     * @throw Exception
     **/
    public void destroy() throws Exception{
        logger.debug("清除 SpringContext 中的 ApplicationContext：{}", context);
        context = null;
    }

    /**
     * 实现 ApplicationContextAware 接口，注入 Context 到静态变量中
     * @param applicationContext
     * @throws BeansException
     **/
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContext.context = applicationContext;
    }

    public static void assertContextInjected(){
        Validate.validState(context!=null, "application 属性未注入，请在 spring-context.xml 配置中定义 SpringContext");
    }
}
