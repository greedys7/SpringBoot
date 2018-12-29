package com.example.springbootdemo.controller;

import com.example.springbootdemo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@RequestMapping("comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    //提交评论
    @RequestMapping("toSave")
    public String save(Integer a_id,String c_content, HttpSession session){
        String c_author = session.getAttribute("user").toString();
        Date date = new Date();
        commentService.save(c_content,c_author,date,a_id);
        return "success";
    }
}
