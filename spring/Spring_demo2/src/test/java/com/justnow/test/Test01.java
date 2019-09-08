package com.justnow.test;

import com.justnow.service.IUserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    @Test
    public void testBean(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService userService = (IUserService) context.getBean("userService");
        IUserService userService1 = (IUserService) context.getBean("userService");
        System.out.println(userService);
        System.out.println(userService1);
    }
}
