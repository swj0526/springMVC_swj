package com.swj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author 孙文举
 * @description
 * @create 2020-02-29 20:32
 */
@Controller
public class RestfulController {
    @RequestMapping("restful/{a}/{b}")
    public String result1(@PathVariable int a, @PathVariable int b, Model model) {
        model.addAttribute("msg", a + b);
        return "restful";
    }

    @PutMapping("restful/{a}/{b}")
    public String result2(@PathVariable int a, @PathVariable int b, Model model) {
        model.addAttribute("msg", a + b + " (PutMapping)");
        return "restful";
    }

    @DeleteMapping("restful/{a}/{b}")
    public String result3(@PathVariable int a, @PathVariable int b, Model model) {
        model.addAttribute("msg", a + b + " (DeleteMapping)");
        return "restful";
    }
}