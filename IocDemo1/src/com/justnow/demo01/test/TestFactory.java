package com.justnow.demo01.test;

import com.justnow.demo01.service.UserService;
import org.junit.Test;

public class TestFactory {
    @Test
    public void test(){
        UserService userService = new UserService();
        userService.updateById(10);
    }
}
