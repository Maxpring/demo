package com.zjrcu.alan.service.impl;

import com.zjrcu.alan.entities.Tbuser;
import com.zjrcu.alan.entities.User;
import com.zjrcu.alan.mapper.TbuserMapper;
import com.zjrcu.alan.mapper.UserMapper;
import com.zjrcu.alan.service.ITbuserService;
import com.zjrcu.alan.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TbuserServiceImpl implements ITbuserService {

//    @Autowired
//    private TbuserMapper tbuserMapper;
//
//    @Override
//    public List<Tbuser> getTbuser() {
//        return tbuserMapper.getTbuser();
//    }
//
//    @Override
//    public List<Tbuser> getTbuserById() {
//        return tbuserMapper.getTbuserById(int id);
//    }

    @Autowired
    private TbuserMapper tbuserMapper;

    @Override
    public List<Tbuser> getTbuser() {
        return tbuserMapper.getTbuser();
    }

    @Override
    public List<Tbuser> getTbuserById(int id) {
        return tbuserMapper.getTbuserById(id);
    }
}
