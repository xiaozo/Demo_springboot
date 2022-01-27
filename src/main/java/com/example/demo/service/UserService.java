package com.example.demo.service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserService {

    @Resource
    private UserMapper userMapper;

    @Cacheable(value = "User")
    public User getUser(Integer id) {
        User user =  userMapper.getUserById(id);
        return user;
    }

    @CachePut(value = "User",key = "#user.id")
    public User updateUser(User user) {
        userMapper.updateUser(user);
        return user;
    }
}
