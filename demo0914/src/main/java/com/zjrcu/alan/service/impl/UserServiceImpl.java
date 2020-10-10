package com.zjrcu.alan.service.impl;

import com.zjrcu.alan.entities.User;
import com.zjrcu.alan.mapper.UserMapper;
import com.zjrcu.alan.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserById(int id) {
        return userMapper.getUserById(id);
    }

    @Override
    public List<User> ListUser() {
        return userMapper.getUser();
    }
}
