package com.example.demo;

import com.example.demo.bean.User;
import com.example.demo.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class UserServiceImplTest {
    @Autowired
    UserServiceImpl userService;

    @Test
    public void queryAll(){
        userService.queryAll().forEach(System.out::println);
    }

    @Test
    public void add() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 25; ++i) {
            User user = User.builder().id(i + 1).name("testw" + i).sex(i % 2 == 0 ? "男" : "女").pwd("aaaa").email("123" + i + "@qq.com").build();
            users.add(user);
        }
        users.forEach(System.out::println);
        userService.add(users);
    }
}
