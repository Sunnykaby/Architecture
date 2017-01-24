package com.springmvc.test;

import com.springmvc.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by shidian on 2017/1/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContext.xml"})
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void addUser(){
        userService.addUser("shidian","123");
    }

    @Test
    public void getUser(){
        System.out.println(userService.getUserById(2));
    }

}
