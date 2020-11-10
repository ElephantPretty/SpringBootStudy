package com.fromework.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class Quick2Controller {
    //这个注解意思是从配置文件中获取数据
    @Value("${name}")
    private String name;
    @Value("${person.addr}")
    private String addr;

    @RequestMapping("/quick3")
    @ResponseBody
    public String quick2(){
        //获得配置文件的信息
//        System.out.println(name);
        return "name:" + name + ",addr=" + addr;
    }
}
