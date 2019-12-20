package com.sollan.domain;

import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

/**
 * @author 16190
 * @date 2019/11/29 09 42
 * @description 用于接收前端jsp页面表单发送的数据
 * 将数据存储在Javabean中
 * HelloController类能够获取到已获取数据的本类对象
 */


public class Account {

    //普通字段
    private String username;
    private String password;
    private Double money;

    //引用类型字段
    private User user;

    //集合类型
    private List<User> list;
    private Map<String,User> map;




    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "user=" + user +
                ", list=" + list +
                ", map=" + map +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                '}';
    }
}
