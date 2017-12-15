package com.example.springbootdemo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yangzhaoyuan on 2017/12/14.
 */
@Controller
public class IndexController {

    /**
     * 测试thymeleaf 模板
     * @param map
     * @return
     */
    @RequestMapping("/thymeleaf")
    public String thymeleaf(ModelMap map){
        map.put("host","thymeleaf");
        return "index";
    }

    /**
     * 测试beetl模板
     * @param map
     * @return
     */
    @RequestMapping("/beetl")
    public String beetl(ModelMap map){
        map.put("host","beetl");
        return "/beetl";
    }
}
