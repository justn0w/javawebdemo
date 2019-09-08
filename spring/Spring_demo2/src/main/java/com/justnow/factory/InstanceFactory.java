package com.justnow.factory;

import com.justnow.service.IUserService;
import com.justnow.service.impl.UserServiceImpl;

/**
 * 模拟一个实例工厂，创建业务层实现类
 * 此工厂创建对象，必须有工厂实例对象，再调用方法
 */
public class InstanceFactory {
    public IUserService createUserService(){
        return new UserServiceImpl();
    }
}
