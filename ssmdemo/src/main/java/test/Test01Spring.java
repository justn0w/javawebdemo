package test;

import com.justnow.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01Spring {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService userService = context.getBean("userService", IUserService.class);
        userService.findAll();
    }
}
