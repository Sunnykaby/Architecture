package com.springmvc.service;

import com.springmvc.model.User;

/**
 * Created by shidian on 2017/1/24.
 */

public interface UserService {
    /**
     * 添加用户
     * @param name
     * @param password
     * @return
     */
    void addUser(String name, String password);

    /**
     * 通过ID获取User信息
     * @param id
     * @return
     */
    User getUserById(int id);

}
