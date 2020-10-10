package com.zjrcu.alan.entities;

import lombok.Data;

import java.io.Serializable;


@Data
public class Tuser implements Serializable {
    private static final long serialVersionUID = 8655851615465363473L;
    private Long id;
    private String username;
    private String password;


    public Tuser(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
