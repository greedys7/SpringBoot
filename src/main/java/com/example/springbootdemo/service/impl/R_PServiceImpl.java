package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.dao.R_PDAO;
import com.example.springbootdemo.entity.R_P;
import com.example.springbootdemo.service.R_PService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class R_PServiceImpl implements R_PService {

    @Autowired
    private R_PDAO r_pdao;

    //查找所有角色对应的所有权限
    public List<R_P> findPermission(){
        return r_pdao.findPermission();
    }

    //添加角色的权限
    public void add(Integer r_id,Integer p_id){
        r_pdao.add(r_id,p_id);
    }
}
