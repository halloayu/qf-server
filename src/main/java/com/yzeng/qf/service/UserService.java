package com.yzeng.qf.service;

import com.yzeng.qf.pojo.model.UserDomain;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    /**
     * 增加用户
     * @param user 用户
     */
    void addUser(UserDomain user);

    /**
     * 删除用户
     * @param user_id 用户id
     */
    void deleteUserById(Integer user_id);

    /**
     * 更新用户信息
     * @param user 用户
     * @return true or false
     */
    int updateUserInfo(UserDomain user);

    /**
     * 根据主键编号获取用户信息
     * @param user_id 主键编号
     * @return 一条记录
     */
    UserDomain getUserInfoById(Integer user_id);

    /**
     * 用户登录
     * @param username 用户名
     * @param password 密码
     * @return 一条记录
     */
    UserDomain login(String username, String password);
}