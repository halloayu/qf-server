package com.yzeng.qf.service.impl;

import com.yzeng.qf.dao.UserDao;
import com.yzeng.qf.pojo.model.UserDomain;
import com.yzeng.qf.service.UserService;
import com.yzeng.qf.util.DateKit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<UserDomain> queryUsers(String username) {
        return userDao.queryUserByName(username);
    }

    @Override
    public UserDomain getUserInfoById(Integer user_id) {
        return userDao.getUserInfoById(user_id);
    }

    @Override
    public UserDomain getUserInfoByName(String username) {
        return userDao.getUserInfoByName(username);
    }

    @Override
    public int register(UserDomain userDomain) {
        userDomain.setRole(2);
        userDomain.setCreate_time(DateKit.getNowTime());
        userDomain.setStatus(1);
        try {
            userDao.addUser(userDomain);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }
}
