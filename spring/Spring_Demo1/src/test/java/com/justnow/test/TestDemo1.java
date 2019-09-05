package com.justnow.test;

import com.justnow.dao.IUserDao;
import com.justnow.service.IUserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo1 {

    @Test
    public void testBean(){
        //1. 使用ApplicationContext接口，就是在获取spring容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2. 根据Bean的id值获取对象
        IUserService userService = (IUserService) context.getBean("userService");
        //3. 调用userService中的updateById的方法
        userService.updateById(10);
    }

}
