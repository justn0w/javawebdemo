package com.justnow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/findAll")
    public String findAll(){
        System.out.println("测试通过");
        return "userList";
    }
}
