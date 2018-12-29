package com.example.springbootdemo.entity;

import java.util.Date;

public class Comment {
    private int c_id;
    private String c_author;
    private String c_content;
    private Date c_time;
    private int a_id;

    public String getC_content() {
        return c_content;
    }

    public void setC_content(String c_content) {
        this.c_content = c_content;
    }

    public int getA_id() {
        return a_id;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getC_author() {
        return c_author;
    }

    public void setC_author(String c_author) {
        this.c_author = c_author;
    }

    public Date getC_time() {
        return c_time;
    }

    public void setC_time(Date c_time) {
        this.c_time = c_time;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "c_id=" + c_id +
                ", c_author='" + c_author + '\'' +
                ", c_content='" + c_content + '\'' +
                ", c_time=" + c_time +
                ", a_id=" + a_id +
                '}';
    }
}
