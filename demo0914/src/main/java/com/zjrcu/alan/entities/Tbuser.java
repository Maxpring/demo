package com.zjrcu.alan.entities;

import lombok.Data;

import java.util.Date;

@Data
public class Tbuser {
    private String userName;
    private int id;
    private String name;
    private String password;
    private int age;
    private int sex;
    private Date birthday;
    private String note;
    private Date created;
    private Date updated;

    @Override
    public String toString() {
        return "Tbuser{" +
                "userName='" + userName + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", note='" + note + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }

}
