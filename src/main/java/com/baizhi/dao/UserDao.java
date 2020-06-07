package com.baizhi.dao;

import org.apache.ibatis.annotations.Param;
import com.baizhi.entity.User;

/**
 * @author 杨志远
 * @date 2020-06-06 12:29
 */
public interface UserDao {

    /**
     * 注册
     *
     * @param user
     */
    void save(User user);

    /**
     * 登录
     *
     * @param username
     * @param password
     */
    User login(@Param("username") String username, @Param("password") String password);

}
