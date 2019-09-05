package com.justnow.service.impl;

import com.justnow.dao.IUserDao;
import com.justnow.service.IUserService;

public class UserServiceImpl implements IUserService {

    private IUserDao userDao;

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void updateById(int id) {
        userDao.updateById(10);
    }
}
