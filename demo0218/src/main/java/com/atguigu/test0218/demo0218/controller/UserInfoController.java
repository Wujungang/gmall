package com.atguigu.test0218.demo0218.controller;


import com.atguigu.test0218.demo0218.bean.UserInfo;
import com.atguigu.test0218.demo0218.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserInfoController {

    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    public List<UserInfo> findAll(){
        return userService.findAll();
    }

    @RequestMapping("addUser")
    public void addUser(UserInfo userInfo){
        userInfo.setLoginName("wujungang");
        userInfo.setPasswd("666666");
        userService.addUser(userInfo);
        System.out.println(userInfo.getId());

    }

    @RequestMapping("upById")
    public String upById(UserInfo userInfo){
        userInfo.setName("0218haha");
        userInfo.setId("5");
        userService.upUser(userInfo);
        return "ok";
    }

    @RequestMapping("upByName")
    public String upUserByName(UserInfo userInfo){
        userInfo.setName("123");
        userInfo.setPasswd("123456");
        userInfo.setEmail("172605831@qq.com");
        userService.upUserByName(userInfo);
        return "ok";
    }

    @RequestMapping("delUser")
    public String delUser(UserInfo userInfo){
        userService.delUser(userInfo);
        return "ok";
    }
}
