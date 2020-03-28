package com.yzeng.qf.service;

import com.yzeng.qf.pojo.model.UserDomain;
import org.springframework.stereotype.Service;

import java.util.List;

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
     * 根据用户名查询用户
     * @param username 用户名
     * @return list
     */
    List<UserDomain> queryUsers(String username);

    /**
     * 根据主键编号获取用户信息
     * @param user_id 主键编号
     * @return 一条记录
     */
    UserDomain getUserInfoById(Integer user_id);

    /**
     * 用户登录
     * @param username 用户名
     * @return 一条记录
     */
    UserDomain getUserInfoByName(String username);

    /**
     * 客户端注册用户
     * @param userDomain userDomain
     */
    int register(UserDomain userDomain);
}
