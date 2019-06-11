package com.itheima.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public Map sayHello(){
        Map map = new HashMap();
        map.put("hello","world");
        return map;
    }
}
