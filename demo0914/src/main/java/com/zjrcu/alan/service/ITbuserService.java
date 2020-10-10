package com.zjrcu.alan.service;

import com.zjrcu.alan.entities.Tbuser;
import com.zjrcu.alan.entities.User;

import java.util.List;

public interface ITbuserService {
    List<Tbuser> getTbuser();

    List<Tbuser> getTbuserById(int id);
}
