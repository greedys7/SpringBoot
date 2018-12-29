package com.example.springbootdemo.service;

import com.example.springbootdemo.entity.U_R;

import java.util.List;

public interface U_RService {

    //查找用户对应的角色
    List<U_R> findRole();

    //根据用户名查找角色名
    U_R findByUsername(String username);

    //根据用户名修改角色
    void updateRole(String r_name,String username);
}
