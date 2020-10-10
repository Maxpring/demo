package com.zjrcu.alan.mapper;

import com.zjrcu.alan.entities.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getUser();

    List<User> getUserById(int id);

    List<User> getUserByName(String name);
}
