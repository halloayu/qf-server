package com.yzeng.qf.handler;

import com.yzeng.qf.constant.MessageConstant;
import com.yzeng.qf.pojo.model.UserDomain;
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
        response.setStatus(200);
        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().append("{\"code\":"+currentUser.getRole()+",\"msg\":\""+ MessageConstant.Auth.LOGIN_SUCCESS +"\",\"data\":\"success\"}");
    }
}
