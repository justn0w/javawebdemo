package com.justnow.service.impl;

import com.justnow.service.IUserService;

import java.util.Date;

public class UserServiceImpl implements IUserService {

    private String name;
    private Integer age;
    private Date birthdy;

    //set 方法注入
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthdy(Date birthdy) {
        this.birthdy = birthdy;
    }

    public void save(){
        System.out.println(name+","+age+","+birthdy);
    }

}
