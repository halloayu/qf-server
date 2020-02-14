package com.yzeng.qf.constant;

public interface MessageConstant {

    // 用户
    interface Auth {
        static final String LOGIN_SUCCESS = "登录成功";
        static final String LOGIN_USER_EMPTY = "找不到该用户";
        static final String LOGIN_PASSWORD_ERROR = "密码错误, 请重新尝试";
        static final String LOGIN_USER_INVALID = "无效用户";
    }
}
