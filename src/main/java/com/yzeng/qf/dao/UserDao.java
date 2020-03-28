package com.yzeng.qf.dao;

import com.yzeng.qf.pojo.model.UserDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDao {

    /**
     * 增加用户
     * @param user 用户
     */
    void addUser(UserDomain user);

    /**
     * 删除用户
     * @param user_id 用户id
     */
    void deleteUserById(@Param("user_id") Integer user_id);

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
    List<UserDomain> queryUserByName(@Param("username") String username);

    /**
     * 根据主键编号获取用户信息
     * @param user_id 主键编号
     * @return 一条记录
     */
    UserDomain getUserInfoById(@Param("user_id") Integer user_id);

    /**
     * 根据用户名获取用户信息
     * @param username 用户名
     * @return 一条记录
     */
    UserDomain getUserInfoByName(@Param("username") String username);
}
