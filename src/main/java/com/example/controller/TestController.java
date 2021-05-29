package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Betty
 * @date 2021年05月29日
 */
@RestController
public class TestController {


    @GetMapping("hello")
    public String hello() {
        return "hello world";
    }

    @GetMapping("test/{name}")
    public String test(@PathVariable("name") String name) {
        return "你好，" + name;
    }

}
