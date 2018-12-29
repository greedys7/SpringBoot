package com.example.springbootdemo.service;


import com.example.springbootdemo.entity.Comment;

import java.util.Date;
import java.util.List;

public interface CommentService {
    //根据文章id查找所有的回复
    Integer findCount(Integer id);

    Date findLastTime(Integer id);

    //根据文章id查找对应的评论内容
    List<Comment> findComment(Integer id);

    //保存评论
    void save(String c_content,String c_author,Date c_time,Integer a_id);
}
