package com.example.demo.service.impl;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> queryAll() {
        return userMapper.selectList(null);
    }

    @Override
    public void add(List<User> users) {
        saveOrUpdateBatch(users);
    }
}
