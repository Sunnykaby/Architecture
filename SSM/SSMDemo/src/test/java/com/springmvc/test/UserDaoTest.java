package com.springmvc.test;

import com.springmvc.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by shidian on 2017/1/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class UserDaoTest {
    //注入dao实现类依赖
    @Resource
    private UserDao userDao;
    @Test
    public void addUser(){
        userDao.addUser("jacky","123456");
        System.out.println(userDao.getUserById(1).toString());
    }
}
