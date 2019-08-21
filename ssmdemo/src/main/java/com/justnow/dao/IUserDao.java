package com.justnow.dao;

import com.justnow.domain.User;

import java.util.List;

public interface IUserDao {
    public List<User> findAll();
}
