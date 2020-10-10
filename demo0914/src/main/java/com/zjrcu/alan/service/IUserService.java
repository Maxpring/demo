package com.zjrcu.alan.service;

import com.zjrcu.alan.entities.User;

import java.util.List;

public interface IUserService {
    List<User> getUserById(int id);

    List<User> ListUser();
}
