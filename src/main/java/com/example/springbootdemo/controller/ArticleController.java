package com.example.springbootdemo.controller;

import com.example.springbootdemo.annotation.Annotation;
import com.example.springbootdemo.entity.Article;
import com.example.springbootdemo.entity.Comment;
import com.example.springbootdemo.service.ArticleService;
import com.example.springbootdemo.service.CommentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("article")
public class ArticleController {
    @Resource
    private ArticleService articleService;
    @Resource
    private CommentService commentService;

    @RequestMapping("toPublishHtml")
    public String toHtml(){
        return "publish";
    }

    //跳转至文章列表
    @RequestMapping("tolist")
    public String toList(Model model){
        List<Article> list = articleService.findAll();
        model.addAttribute("alist",list);
        model.addAttribute("commentService",commentService);
        return "article_list";
    }

    //跳转至文章详情页
    @RequestMapping("toContent")
    public String toContent(Model model,Integer id){
        List<Comment> comments = commentService.findComment(id);
        model.addAttribute("articleService",articleService.findDetail(id));
        model.addAttribute("comment",comments);
        return "article_content";
    }

    //跳转至修改文章页面
    @Annotation(value = "修改文章记录")
    @RequestMapping("toMyArticle")
    public String toUpdateArticle (Model model,Integer id){
        model.addAttribute("articleService",articleService.findDetail(id));
        return "update_article";
    }

    //跳转至我的文章列表页面
    @RequestMapping("toMyArticleList")
    public String toMyList(Model model, HttpSession session){
        String username = session.getAttribute("user").toString();
        System.out.println(username);
        List<Article> list = articleService.findByAuthor(username);
        System.out.println(list);
        model.addAttribute("mlist",list);
        model.addAttribute("commentService",commentService);
        return "myarticle_list";
    }

    //删除我的一篇文章
    @Annotation(value = "删除文章记录")
    @RequestMapping("toDelete")
    public String toDelete(Integer id){
        articleService.deleteArticle(id);
        System.out.println("删除成功");
        return "redirect:toMyArticleList";
    }

    //修改一篇我的文章
    @RequestMapping("toUpdate")
    public String updateArticle(Integer a_id,String a_title,String a_content){
        articleService.updateArticle(a_id,a_title,a_content);
        return "myarticle_list";
    }

    //发表一篇新的文章
    @RequestMapping("toPublish")
    public String toPublish(HttpSession session,String a_title, String a_content){
        String username = session.getAttribute("user").toString();
        articleService.saveArticle(username,a_title,a_content);
        return "myarticle_list";
    }

}
