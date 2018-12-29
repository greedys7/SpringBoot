package com.example.springbootdemo.dao;

import com.example.springbootdemo.entity.R_P;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface R_PDAO {
    //查找所有角色对应的所有权限
    List<R_P> findPermission();

    //添加角色的权限
    void add(Integer r_id,Integer p_id);

}
