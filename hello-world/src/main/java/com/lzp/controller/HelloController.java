package com.lzp.controller;

import com.lzp.config.OracleTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @Autowired
    OracleTool tool;
    @RequestMapping("/oracleTool")
    public OracleTool getOracleTool(){
        return tool;
    }

    @RequestMapping(value = "/hello")
    public String hello(){
        List list = new ArrayList();
        Object o = list.get(0);
        return "hello springBoot 2.0!!!";
    }
}
