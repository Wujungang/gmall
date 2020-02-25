package com.atguigu.test0218.demo0218.service.impl;

import com.atguigu.test0218.demo0218.bean.UserInfo;
import com.atguigu.test0218.demo0218.mapper.UserInfoMapper;
import com.atguigu.test0218.demo0218.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }
}
