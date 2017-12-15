package com.example.springbootdemo.web.dao;

import com.example.springbootdemo.web.pojo.User;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.mapper.BaseMapper;

import java.util.List;

/**
 * Created by 尼古拉斯·百万 on 2017/12/15.
 */
@SqlResource("user")
public interface UserDao extends BaseMapper<User> {

    List<User> selectUser(User query);

}
