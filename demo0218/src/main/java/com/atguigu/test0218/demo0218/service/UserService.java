package com.atguigu.test0218.demo0218.service;


import com.atguigu.test0218.demo0218.bean.UserInfo;

import java.util.List;

// 业务逻辑层
public interface UserService {

    /**
     * 查询所有数据
     * @return
     */
    List<UserInfo> findAll();

    void addUser(UserInfo userInfo);

    void upUser(UserInfo userInfo);

    void upUserByName(UserInfo userInfo);

    void delUser(UserInfo userInfo);









}
