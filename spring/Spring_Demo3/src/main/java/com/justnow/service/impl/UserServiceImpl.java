package com.justnow.service.impl;

import com.justnow.dao.UserDao;
import com.justnow.domain.User;
import com.justnow.service.IUserService;

public class UserServiceImpl implements IUserService {
    private UserDao userDao;
    private String otherProperty;

    //必须有属性的set方法，否则不能实现依赖注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setOtherProperty(String otherProperty) {
        this.otherProperty = otherProperty;
    }

    public void findAll(User user) {
        userDao.findAll(user);
        System.out.println(otherProperty);
    }
}
