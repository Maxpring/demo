package com.zjrcu.alan.mapper;

import com.zjrcu.alan.entities.Tbuser;
import com.zjrcu.alan.entities.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TbuserMapper {
    List<Tbuser> getTbuser();

    List<Tbuser> getTbuserById(int id);

    List<Tbuser> getTbuserByName(String name);
}
