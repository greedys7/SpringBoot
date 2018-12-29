package com.example.springbootdemo.dao;

import com.example.springbootdemo.entity.Article;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ArticleDAO {
    //查询所有文章的信息
    List<Article> findAll();

    //根据文章id查询详情
    Article findDetail(Integer id);

    //根据登录用户查找所有的文章
    List<Article> findByAuthor(String username);

    //根据文章id删除文章信息
    void deleteArticle(Integer id);

    //修改指定的文章内容
    void updateArticle(Integer a_id,String a_title,String a_content);

    //发表文章
    void saveArticle(String a_author,String a_title, String a_content, Date a_time);

}
