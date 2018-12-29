package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.dao.U_RDAO;
import com.example.springbootdemo.entity.U_R;
import com.example.springbootdemo.service.U_RService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class U_RServiceImpl implements U_RService {
    @Autowired
    private U_RDAO u_rdao;

    //查找用户对应的角色
    public List<U_R> findRole(){
        return u_rdao.findRole();
    }

    //根据用户名查找角色名
    public U_R findByUsername(String username){
        return u_rdao.findByUsername(username);
    }

    //根据用户名修改角色
    public void updateRole(String r_name,String username){
        u_rdao.updateRole(r_name,username);
    }

}
