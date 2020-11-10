package com.fromework.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Component
@ConfigurationProperties(prefix = "person")
public class Quick3Controller {
    private String name;
    private String addr;
    private Integer age;

    @RequestMapping("/quick10")
    @ResponseBody
    public String quick10(){
        //获得配置文件的信息
//        System.out.println(name);
        return "name:" + name + ",addr=" + addr + ",age=" + age;
    }

    public String getName() {
        return name;
    }

    public String getAddr() {
        return addr;
    }

    public Integer getAge() {
        return age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
