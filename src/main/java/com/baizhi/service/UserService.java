package com.baizhi.service;

import com.baizhi.entity.User;

/**
 * @author 杨志远
 * @date 2020-06-06 13:15
 */
public interface UserService {

    /**
     * 注册
     * @param user
     */
    void register(User user);

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    User login(String username,String password);

}
