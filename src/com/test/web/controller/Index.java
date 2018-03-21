package com.test.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller     // 当前是一个控制器类 Index index = new Index();
//@RequestMapping(value = "/index")   // 当前类中所有的方法对应|映射的访问url是： /index
public class Index {
    @RequestMapping(value = "/index", method = RequestMethod.GET)   // 访问url = ../index， 进入index()方法中执行
    public String index() {
        //return "login";     // 返回和视图解析器拼接的String， 完成转发跳转到指定的视图资源
        return "redirect:user/login"; // 转向跳转到一个指定的url， 转到url可以理解为转到一个控制器
    }
}