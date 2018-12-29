package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.dao.CommentDAO;
import com.example.springbootdemo.entity.Comment;
import com.example.springbootdemo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentDAO commentDAO;

    //查找一篇文章的所有评论数
    public Integer findCount(Integer id){
        System.out.println("评论数："+commentDAO.findCount(id));
        return commentDAO.findCount(id);
    }

    //找到最后评论时间
    public Date findLastTime(Integer id){
        return commentDAO.findLastTime(id);

    }

    //根据文章id查找对应的评论内容
    public List<Comment> findComment(Integer id){
        return commentDAO.findComment(id);
    }

    //保存评论
    public void save(String c_content,String c_author,Date c_time,Integer a_id){
        Comment comment = new Comment();
        comment.setC_content(c_content);
        comment.setC_author(c_author);
        comment.setC_time(c_time);
        comment.setA_id(a_id);
        commentDAO.save(comment);
    }


}
