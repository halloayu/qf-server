package com.yzeng.qf.service.impl;

import com.yzeng.qf.dao.UserDao;
import com.yzeng.qf.pojo.model.UserDomain;
import com.yzeng.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao; // 通过构造器强制注入

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(UserDomain user) {

    }

    @Override
    public void deleteUserById(Integer user_id) {

    }

    @Override
    public int updateUserInfo(UserDomain user) {
        return 0;
    }

    @Override
    public UserDomain getUserInfoById(Integer user_id) {
        return userDao.getUserInfoById(user_id);
    }

    @Override
    public UserDomain login(String username, String password) {
        return null;
    }
}
