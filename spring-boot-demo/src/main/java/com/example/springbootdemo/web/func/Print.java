package com.example.springbootdemo.web.func;

import org.beetl.core.Context;
import org.beetl.core.Function;
import org.springframework.util.StringUtils;

/**
 * Created by 尼古拉斯·百万 on 2017/12/15.
 */
public class Print implements Function {

    @Override
    public Object call(Object[] objects, Context context) {
        if(objects != null && objects.length > 0 && !StringUtils.isEmpty(objects[0])){
            return objects[0].toString();
        }
        return "";
    }
}
