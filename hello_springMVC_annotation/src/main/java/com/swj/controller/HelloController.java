package com.swj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 孙文举
 * @description
 * @create 2020-02-28 19:06
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("msg", "于屁屁~~~");
        return "hello";
    }
}