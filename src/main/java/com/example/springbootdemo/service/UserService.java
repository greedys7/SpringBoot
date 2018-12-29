package com.example.springbootdemo.service;


import javax.servlet.http.HttpSession;

public interface UserService {
    //保存用户信息
    void save(String username,String phone, String password);

    //判断用户是否被注册
    Integer isExit(String phone);

    //判断验证码是否正确
    Integer isRight(String username,String phone, String password, String code, String providecide);

    //判断登录账号密码是否正确
    Integer toLogin(HttpSession session,String phone, String password);




}
