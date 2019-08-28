package com.justnow.dao;

import com.justnow.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


public interface IUserDao {
    @Select("select * from user")
    public List<User> findAll();

    @Insert("insert into user(id, username, birthday, sex, address) values (#{id}, #{username}, #{birthday}, #{sex}, #{address})")
    public void save(User user);
}
