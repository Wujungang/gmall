package com.atguigu.test0218.demo0218.service.impl;

import com.atguigu.test0218.demo0218.bean.UserInfo;
import com.atguigu.test0218.demo0218.mapper.UserInfoMapper;
import com.atguigu.test0218.demo0218.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public void addUser(UserInfo userInfo) {
        userInfoMapper.insertSelective(userInfo);
    }

    @Override
    public void upUser(UserInfo userInfo) {

        userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }

    @Override
    public void upUserByName(UserInfo userInfo) {
        Example example = new Example(UserInfo.class);

        example.createCriteria().andEqualTo("name",userInfo.getName());

        userInfoMapper.updateByExampleSelective(userInfo,example);

    }

//    @Override
//    public void delUser(UserInfo userInfo) {
//
//        Example example = new Example(UserInfo.class);
//        example.createCriteria().andEqualTo("name",userInfo.getName());
//        userInfoMapper.deleteByExample(example);
//    }

//    @Override
//    public void delUser(UserInfo userInfo) {
//        userInfoMapper.deleteByPrimaryKey(userInfo);
//
//    }

    @Override
    public void delUser(UserInfo userInfo) {


        userInfoMapper.delete(userInfo);
    }


    
}
