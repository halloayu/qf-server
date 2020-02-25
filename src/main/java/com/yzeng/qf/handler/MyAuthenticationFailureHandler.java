package com.yzeng.qf.handler;

import com.alibaba.fastjson.JSON;
import com.yzeng.qf.constant.MessageConstant;
import com.yzeng.qf.util.APIResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Spring security 登录失败后返回一串json
 */
@Component("MyAuthenticationFailureHandler")
public class MyAuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        // 取得具体的异常信息
        String message = exception.getMessage();
        logger.error(message);
        response.setStatus(401);
        response.setContentType("application/json;charset=UTF-8");
        if (message.equals(MessageConstant.Auth.LOGIN_USER_EMPTY)) { // 找不到用户
            response.getWriter().append(JSON.toJSONString(APIResponse.fail(MessageConstant.Auth.LOGIN_USER_EMPTY)));
        } else if (message.equals(MessageConstant.Auth.LOGIN_PASSWORD_ERROR)) { // 密码错误
            response.getWriter().append(JSON.toJSONString(APIResponse.fail(MessageConstant.Auth.LOGIN_PASSWORD_ERROR)));
        } else { // 无效用户
            response.getWriter().append(JSON.toJSONString(APIResponse.fail(MessageConstant.Auth.LOGIN_USER_INVALID)));
        }
    }
}
