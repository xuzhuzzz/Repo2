package com.zhu.controller;

import com.zhu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserController {
    @Autowired
    UserService userService;

    public void login(String userName,String passWord){

    }
}
