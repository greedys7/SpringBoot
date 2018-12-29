package com.example.springbootdemo.dao;

import com.example.springbootdemo.entity.Comment;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;


@Repository
public interface CommentDAO {
    //根据文章id查找对应的评论数
     Integer findCount(Integer id);

     //根据文章id查找对应的最后评论时间
     Date findLastTime(Integer id);

     //根据文章id查找对应的评论内容
     List<Comment> findComment(Integer id);

     //保存评论
    void save(Comment comment);

}
