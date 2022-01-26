package com.example.demo.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.bean.User;

import java.util.List;

public interface UserService extends IService<User> {
    List<User> queryAll();
    void add(List<User> users);
}
