package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.Article;
import com.example.springbootdemo.entity.R_P;
import com.example.springbootdemo.entity.U_R;
import com.example.springbootdemo.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("management")
public class managementController {
    @Resource
    private ArticleService articleService;
    @Resource
    private U_RService u_rService;
    @Resource
    private UserService userService;
    @Resource
    private R_PService r_pService;
    @Resource
    private CommentService commentService;

    //跳转至管理员登录界面
    @RequestMapping("Login")
    public String Login(){
        return "admin_tologin";
    }

    //管理员登录的判断
    @RequestMapping("toLogin")
    @ResponseBody
    public Integer toLoginA(HttpSession session,String phone, String password){
        System.out.println("tologin");
        Integer flag = userService.toLogin(session,phone,password);
        return flag;
    }

    //跳转到文章列表管理页面
    @RequestMapping("tolist")
    public String toList(Model model){
        List<Article> list = articleService.findAll();
        model.addAttribute("alist",list);
        model.addAttribute("commentService",commentService);
        return "member_management";
    }

    //跳转到角色管理页面
    @RequestMapping("RoleList")
    public String findRole(Model model){
        List<U_R> list = u_rService.findRole();
        System.out.println(list);
        model.addAttribute("rlist",list);
        return "member";
    }

    //跳转到权限管理页面
    @RequestMapping("PowerList")
    public String findPermission(Model model){
        List<R_P> list = r_pService.findPermission();
        System.out.println(list);
        model.addAttribute("plist",list);
        return "permission";
    }

    //修改用户的角色
    @RequestMapping("updateRole")
    @ResponseBody
    public Integer updateRole(String username,String r_name){
        System.out.println("username:"+username+",r_name:"+r_name);
        u_rService.updateRole(r_name,username);
        return 1;
    }

    //添加用户的权限
    @RequestMapping("add")
    @ResponseBody
    public Integer add(Integer r_id,Integer p_id){
        r_pService.add(r_id,p_id);
        return 1;
    }

}
