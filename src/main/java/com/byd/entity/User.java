package com.byd.entity;

/**
 * 用户实体类
 */
public class User {
    private int userid;
    private String username;
    private int number;

    public User() {
    }

    public User(int userid, String username, int number) {
        this.userid = userid;
        this.username = username;
        this.number = number;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "User{" +
            "userid=" + userid +
            ", username='" + username + '\'' +
            ", number=" + number +
            '}';
    }
}
