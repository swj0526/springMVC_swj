package com.swj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 孙文举
 * @description
 * @create 2020-02-29 19:49
 */
//4.用注解写controller
@Controller
public class HelloController {
    @RequestMapping("/hello1")
    public String hello1(Model model) {
        model.addAttribute("msg", "于屁屁1");
        return "hello";
    }
    @RequestMapping("/hello2")
    public String hello2(Model model) {
        model.addAttribute("msg", "于屁屁2");
        return "hello";
    }
}