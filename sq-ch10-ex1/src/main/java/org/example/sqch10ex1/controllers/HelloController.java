package org.example.sqch10ex1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody // HTTP 응답 직접 반환을 나타낸다
    public String hello() {
        return "hello";
    }
}
