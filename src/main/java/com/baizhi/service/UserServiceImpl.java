package com.baizhi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;

/**
 * @author 杨志远
 * @date 2020-06-06 13:16
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void register(User user) {
        //user.setId(UUID.randomUUID().toString()); 当id类型为String时 采用此方法可以实现自动生成主键
        userDao.save(user);

    }

    @Override
    public User login(String username, String password) {
        return userDao.login(username, password);
    }
}
