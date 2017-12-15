package com.example.springbootdemo.web.service.impl;

import com.example.springbootdemo.web.dao.UserDao;
import com.example.springbootdemo.web.pojo.User;
import com.example.springbootdemo.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 尼古拉斯·百万 on 2017/12/15.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao dao;

    @Override
    @Transactional
    public long total() {
        return dao.allCount();
    }

    @Override
    @Transactional
    public void save(User user) {
        dao.insert(user,true);
    }

    @Override
    public List<User> allUser(User query) {
        return dao.selectUser(query);
    }
}
