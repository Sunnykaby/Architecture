package com.springmvc.service.impl;

import com.springmvc.dao.UserDao;
import com.springmvc.model.User;
import com.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by shidian on 2017/1/24.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    //
    @Transactional
    public void addUser(String name, String password) {
        userDao.addUser(name,password);
    }

    @Override
    public User getUserById(int id) {
        return  userDao.getUserById(id);
    }
}
