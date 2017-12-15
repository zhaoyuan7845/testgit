package com.example.springbootdemo.web.service;

import com.example.springbootdemo.web.pojo.User;

import java.util.List;

/**
 * Created by 尼古拉斯·百万 on 2017/12/15.
 */
public interface UserService {
    long total() ;

    void save(User user);

    List<User> allUser(User query);
}
