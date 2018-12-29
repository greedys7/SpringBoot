package com.example.springbootdemo.service;

import com.example.springbootdemo.entity.R_P;

import java.util.List;

public interface R_PService {
    //查找所有角色对应的所有权限
    List<R_P> findPermission();

    //添加角色的权限
    void add(Integer r_id,Integer id);

}
