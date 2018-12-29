package com.example.springbootdemo.controller;

import com.example.springbootdemo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("toHome")
    public String toHome(){
        return "home";
    }

    //登录
    @RequestMapping("tologin")
    public String toLogin(){
        return "login";
    }

    //注册
    @RequestMapping("toregister")
    public String toRegister(){
        return "register";
    }


    //保存用户信息
    @ResponseBody
    @RequestMapping("saveUser")
    public void save(String username,String phone,String password){
        System.out.println(username);
        this.userService.save(username,phone,password);
    }

    //注册页面的一系列判断
    @ResponseBody
    @RequestMapping("addUser")
    public Integer addUser(String username,String phone, String password, String code, String providecode){
        System.out.println("test1");
        Integer right = userService.isRight(username,phone, password, code, providecode);
        return right;
    }

    //登录页面的判断
    @ResponseBody
    @RequestMapping("login")
    public Integer login(HttpSession session,String phone, String password){
        Integer flag = userService.toLogin(session,phone,password);
        return flag;
    }





}
