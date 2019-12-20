package com.sollan.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 16190
 * @date 2019/11/29 10 11
 * @description
 */

public class User  implements Serializable {
    private String uname;
    private Integer age;
    private Date date;

    public Date getDate(Date date) {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}
