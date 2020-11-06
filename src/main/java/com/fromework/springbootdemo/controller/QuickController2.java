package com.fromework.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuickController2{
    @RequestMapping("/quick2")
    public String quick1() {
        return "Spring111";
    }
}