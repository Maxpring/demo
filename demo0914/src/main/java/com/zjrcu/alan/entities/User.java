package com.zjrcu.alan.entities;

import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    private String password;
    private String phone;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
