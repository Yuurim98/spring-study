package org.example.sqch8ex1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/home")
    public String home(Model page) {
        page.addAttribute("username", "홍길동");
        page.addAttribute("color", "red");
        return "home.html";
    }

    @RequestMapping("/home2")
    public String home2(@RequestParam(required = false) String color, @RequestParam String name, Model page) {
        page.addAttribute("username", name);
        page.addAttribute("color", color);
        return "home.html";
    }

}
