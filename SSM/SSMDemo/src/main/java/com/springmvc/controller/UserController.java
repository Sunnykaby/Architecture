package com.springmvc.controller;


import com.springmvc.model.User;
import com.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.PrintWriter;

/**
 * Created by shidian on 2017/1/23.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public void index(PrintWriter printWriter, @RequestParam("name")String name, @RequestParam("password")String psw){
        userService.addUser(name,psw);
        printWriter.write("successful");

    }

    @RequestMapping(value = "/detail",method = RequestMethod.GET)
    public ModelAndView detail(ModelAndView modelAndView, @RequestParam("id")Integer id){
        User user = userService.getUserById(id);
        modelAndView.addObject("user", user);
        modelAndView.setViewName("user/detail");
        return modelAndView;
    }
}
