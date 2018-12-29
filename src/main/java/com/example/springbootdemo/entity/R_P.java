package com.example.springbootdemo.entity;

public class R_P {
    private int r_p_id;
    private int r_id;
    private int p_id;
    private String permission;
    private String r_name;

    public int getR_p_id() {
        return r_p_id;
    }

    public void setR_p_id(int r_p_id) {
        this.r_p_id = r_p_id;
    }

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name;
    }

    @Override
    public String toString() {
        return "R_P{" +
                "r_p_id=" + r_p_id +
                ", r_id=" + r_id +
                ", p_id=" + p_id +
                ", permission='" + permission + '\'' +
                ", r_name='" + r_name + '\'' +
                '}';
    }
}
