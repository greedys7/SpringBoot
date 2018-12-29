package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.dao.U_RDAO;
import com.example.springbootdemo.dao.UserDAO;
import com.example.springbootdemo.entity.U_R;
import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;
    @Autowired
    private U_RDAO u_rdao;

    //保存用户信息
    public void save(String username,String phone,String password){
        User user = new User();
        user.setUsername(username);
        user.setUser_phone(phone);
        user.setUser_pwd(password);
        userDAO.save(user);
    }

    //判断用户是否被注册
    public Integer isExit(String phone){
        //0:默认；1：已注册
        int flag = 0;
        User u = userDAO.findByPhone(phone);
        if(u!=null&&phone.equals(u.getUser_phone())){
            flag = 1;
        }
        return flag;
    }

    //判断验证码是否正确
    public Integer isRight(String username,String phone,String password,String code, String providecode){
        //3:默认信息完整;4:信息填写不完整;5：验证码错误或失效；
        int flag = 3;

        if(("").equals(username)||("").equals(phone)||("").equals(password)||("").equals(code)){
            flag = 4;
            System.out.println("信息不完整");
        }else if(!code.equals(providecode)){
            flag = 5;
            System.out.println("验证码错误或失效");
        }else if(this.isExit(phone)==1){
            flag = 1;
            System.out.println("用户已注册");
        }
        return flag;
    }

    //判断登录账号密码是否正确
    public Integer toLogin(HttpSession session,String phone, String password){
        //0：默认；1：登录成功;2:手机号输入错误 3:密码错误 4:管理员
        Integer flag = 0;
        User u = userDAO.findByPhone(phone);
        if(u!=null&&phone.equals(u.getUser_phone())){
            if(password.equals(u.getUser_pwd())){
                flag = 1;
                session.setAttribute("user",u.getUsername());
                if("管理员".equals(u_rdao.findByUsername(u.getUsername()))){
                    System.out.println("比较:"+u_rdao.findByUsername(u.getUsername()));
                    flag = 4;
                }
            }else{
                flag = 3;
            }
        }else{
            flag = 2;
        }
        return flag;
    }





}
