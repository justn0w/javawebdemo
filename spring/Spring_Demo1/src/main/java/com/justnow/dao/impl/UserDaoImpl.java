package com.justnow.dao.impl;

import com.justnow.dao.IUserDao;

public class UserDaoImpl implements IUserDao {
    @Override
    public void updateById(int id) {
        System.out.println("更新了用户：" + id);
    }
}
