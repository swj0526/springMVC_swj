package com.swj.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 孙文举
 * @description
 * @create 2020-02-28 9:41
 */
public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //6.需要返回一个ModelAndView，装数据，封视图；
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "hello~~于屁屁");//装数据
        modelAndView.setViewName("hello");//封视图,拼接WEB-INF/jsp/hello.jsp
        return modelAndView;
    }
}