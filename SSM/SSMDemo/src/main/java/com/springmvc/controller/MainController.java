package com.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by shidian on 2017/1/23.
 */
@Controller
public class MainController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView index(ModelAndView modelAndView, HttpServletRequest request){
        modelAndView.addObject("contextPath",request.getContextPath());
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
