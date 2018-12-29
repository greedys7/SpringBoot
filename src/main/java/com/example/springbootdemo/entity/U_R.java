package com.example.springbootdemo.entity;

public class U_R {
    private int u_r_id;
    private int u_id;
    private int r_id;
    private String username;
    private String r_name;

    public int getU_r_id() {
        return u_r_id;
    }

    public void setU_r_id(int u_r_id) {
        this.u_r_id = u_r_id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name;
    }

    @Override
    public String toString() {
        return "U_R{" +
                "u_r_id=" + u_r_id +
                ", u_id=" + u_id +
                ", r_id=" + r_id +
                ", username='" + username + '\'' +
                ", r_name='" + r_name + '\'' +
                '}';
    }

}
