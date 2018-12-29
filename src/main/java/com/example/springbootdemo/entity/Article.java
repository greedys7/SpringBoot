package com.example.springbootdemo.entity;

import com.sun.xml.internal.ws.spi.db.DatabindingException;

import java.util.Date;
import java.util.List;

public class Article {
    private int a_id;
    private String a_title;
    private String a_content;
    private Date a_time;
    private String a_author;
    private List<Comment> comments;

    public String getA_author() {
        return a_author;
    }

    public void setA_author(String a_author) {
        this.a_author = a_author;
    }

    public int getA_id() {
        return a_id;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public String getA_title() {
        return a_title;
    }

    public void setA_title(String a_title) {
        this.a_title = a_title;
    }

    public String getA_content() {
        return a_content;
    }

    public void setA_content(String a_content) {
        this.a_content = a_content;
    }

    public Date getA_time() {
        return a_time;
    }

    public void setA_time(Date a_time) {
        this.a_time = a_time;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Article{" +
                "a_id=" + a_id +
                ", a_title='" + a_title + '\'' +
                ", a_content='" + a_content + '\'' +
                ", a_time='" + a_time + '\'' +
                ", a_author='" + a_author + '\'' +
                '}';
    }
}
