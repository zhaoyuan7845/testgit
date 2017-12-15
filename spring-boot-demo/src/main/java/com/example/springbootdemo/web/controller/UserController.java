package com.example.springbootdemo.web.controller;

import com.example.springbootdemo.web.pojo.User;
import com.example.springbootdemo.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

/**
 * Created by 尼古拉斯·百万 on 2017/12/15.
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/insert")
    public String insert(){
        User user = new User();
        user.setAge(20);
        user.setName("张无忌");
        user.setBir(new Date());
        userService.save(user);
        return "success";
    }

    @RequestMapping("/list")
    public ModelAndView list(){
        User user = new User();
        user.setName("张无忌");
        List<User> list =  userService.allUser(user);
        ModelAndView view = new ModelAndView("/list");
        view.addObject("list", list);
        return view;
    }
}
