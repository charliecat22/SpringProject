package com.example.springbootproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * test
 *
 * @author ZYH
 * @date 2021-05-25 10:54 下午
 **/
@Controller
public class TestController {


    @PostMapping("/hello")
    public String test() {
        return "hello";
    }
}
