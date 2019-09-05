package com.justnow.demo01.service;

import com.justnow.demo01.dao.UserDao;
import com.justnow.demo01.factory.DaoFactory;

public class UserService {
    private UserDao userDao = (UserDao) DaoFactory.getUserDao();// 使用反射的方法进行


    public void updateById(int id){
        userDao.updateById(id);
    }
}
