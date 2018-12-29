package com.example.springbootdemo.dao;

import com.example.springbootdemo.entity.U_R;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface U_RDAO {

    //查找所有用户对应的角色
    List<U_R> findRole();

    //根据用户名查找角色名
    U_R findByUsername(String username);

    //根据用户名修改角色
    void updateRole(String r_name,String username);

}
