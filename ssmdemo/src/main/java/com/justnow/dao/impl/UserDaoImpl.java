package com.justnow.dao.impl;

import com.justnow.dao.IUserDao;
import com.justnow.domain.User;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository("userDao")
public class UserDaoImpl implements IUserDao {
    @Override
    public List<User> findAll() {
        System.out.println("查询了所有账户");
        return null;
    }
}
