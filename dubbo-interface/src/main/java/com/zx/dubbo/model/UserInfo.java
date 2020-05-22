package com.zx.dubbo.model;

import java.io.Serializable;

public class UserInfo implements Serializable {

    public String userName;

    public Integer age;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}