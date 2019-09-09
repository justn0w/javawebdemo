package com.justnow.test;

import com.justnow.service.IUserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
/*
    @Test
    public void testBean(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService userService = (IUserService) context.getBean("userService");
        IUserService userService1 = (IUserService) context.getBean("userService");
        System.out.println(userService);
        System.out.println(userService1);
    }
*/

    /**
     * 测试通过构造函数实现依赖注入
     */
    @Test
    public void testConstrutor(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService userService = (IUserService) context.getBean("userService");
        userService.save();
    }

    /**
     * 测试通过set方法实现依赖注入
     */
    @Test
    public void testSet(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService userService = (IUserService) context.getBean("userService");
        userService.save();
    }
}
