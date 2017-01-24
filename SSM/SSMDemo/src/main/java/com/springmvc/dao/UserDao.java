package com.springmvc.dao;

import com.springmvc.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by shidian on 2017/1/23.
 */

public interface UserDao {
    void addUser(@Param("userName")String userName, @Param("password")String password);
    User getUserById( Integer id);
}
