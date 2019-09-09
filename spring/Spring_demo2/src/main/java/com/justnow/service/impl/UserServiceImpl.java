package com.justnow.service.impl;

import com.justnow.service.IUserService;

import java.util.Date;

public class UserServiceImpl implements IUserService {

    private String name;
    private Integer age;
    private Date birthdy;

    public UserServiceImpl() {
    }

    public UserServiceImpl(String name, Integer age, Date birthdy){
        this.name = name;
        this.age = age;
        this.birthdy = birthdy;
    }

    public void save(){
        System.out.println(name+","+age+","+birthdy);
    }

/*    public void findAll() {
        System.out.println("假装打印了数据库中的所有数据");
    }*/
}
