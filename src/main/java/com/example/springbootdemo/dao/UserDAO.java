package com.example.springbootdemo.dao;


import com.example.springbootdemo.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {
    //注册 保存用户信息
    void save(User user);

    //通过手机号查询密码
    User findByPhone(String phone);




}
