package com.yzeng.qf.constant;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class WebConstant {
    /**
     * 网站配置
     */
    public static Map<String, String> initConfig = new HashMap<>();

    /**
     * session的key
     */
    public static final String LOGIN_SESSION_KEY = "login_user";

    public static final String USER_IN_COOKIE = "q_f_cookie";


}
