package com.justnow.factory;

import com.justnow.service.IUserService;
import com.justnow.service.impl.UserServiceImpl;

public class StaticFactory {
    public static IUserService createUserService(){
        return new UserServiceImpl();
    }
}
