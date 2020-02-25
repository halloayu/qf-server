package com.yzeng.qf.pojo.dto;


/**
 * 用户登录成功后返回信息
 */
public class UserDto {
    /**
     * 主键编号
     */
    private Integer user_id;
    /**
     * 用户名
     */
    private String username;
    /**
     * token
     */
    private String token;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "user_id=" + user_id +
                ", username='" + username + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
