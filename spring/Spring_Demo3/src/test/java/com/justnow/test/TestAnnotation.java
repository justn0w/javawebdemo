package com.justnow.test;


import com.justnow.domain.User;
import com.justnow.service.IUserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;

public class TestAnnotation {

    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService userService = (IUserService) context.getBean("userService");
        User user = new User();
        user.setId(1);
        user.setName("justnow");
        user.setMoney(1.0f);
        userService.findAll(user);
    }
}
