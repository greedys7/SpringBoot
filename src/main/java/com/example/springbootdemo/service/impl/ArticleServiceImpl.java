package com.example.springbootdemo.service.impl;


import com.example.springbootdemo.dao.ArticleDAO;
import com.example.springbootdemo.entity.Article;
import com.example.springbootdemo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleDAO articleDAO;

    //查找文章列表需要展现的数据
    public List<Article> findAll(){
        return articleDAO.findAll();
    }

    //根据文章id查询详情
    public Article findDetail(Integer id){
        return articleDAO.findDetail(id);
    }

    //根据文章id删除文章信息
    public void deleteArticle(Integer id){
        articleDAO.deleteArticle(id);
    }

    //根据登录用户查找所有的文章
    public List<Article> findByAuthor(String username){
        return articleDAO.findByAuthor(username);
    }

    //修改指定的文章内容
    public void updateArticle(Integer a_id,String a_title,String a_content){
        articleDAO.updateArticle(a_id,a_title,a_content);
    }

    //发表文章
    public void saveArticle(String a_author, String a_title, String a_content){
        Date date = new Date();
        articleDAO.saveArticle(a_author,a_title,a_content,date);
    }


}
