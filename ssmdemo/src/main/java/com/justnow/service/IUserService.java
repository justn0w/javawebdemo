package com.justnow.service;

import com.justnow.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IUserService {
    public List<User> findAll();
    public void save(User user);
}
