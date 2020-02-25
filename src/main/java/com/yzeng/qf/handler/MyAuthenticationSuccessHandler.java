package com.yzeng.qf.handler;

import com.alibaba.fastjson.JSON;
import com.yzeng.qf.constant.MessageConstant;
import com.yzeng.qf.constant.WebConstant;
import com.yzeng.qf.pojo.dto.UserDto;
import com.yzeng.qf.pojo.model.UserDomain;
import com.yzeng.qf.util.APIResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Spring security 登录成功后返回一串json
 */
@Component("MyAuthenticationSuccessHandler")
public class MyAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        UserDomain currentUser = (UserDomain) authentication.getPrincipal();
        logger.info(currentUser.getUsername()+"登录成功");
        request.getSession().setAttribute(WebConstant.LOGIN_SESSION_KEY, currentUser); // 登录成功存入session
        UserDto userDto = new UserDto();
        userDto.setUser_id(currentUser.getUser_id());
        userDto.setToken("1234fdfksfjfe");
        userDto.setUsername(currentUser.getUsername());
        response.setStatus(200);
        response.setContentType("application/json; charset=UTF-8");
        response.getWriter().append(JSON.toJSONString(APIResponse.success(currentUser.getRole(),MessageConstant.Auth.LOGIN_SUCCESS, userDto)));
    }
}
