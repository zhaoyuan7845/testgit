package com.example.springbootdemo.web.pojo;

import org.beetl.sql.core.annotatoin.AutoID;

import java.util.Date;

/**
 * Created by 尼古拉斯·百万 on 2017/12/15.
 */
public class User {
    @AutoID
    private Integer id ;
    private Integer age ;
    private String name ;
    private Date bir ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBir() {
        return bir;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }
}
