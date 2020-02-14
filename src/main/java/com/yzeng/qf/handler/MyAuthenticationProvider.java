package com.yzeng.qf.handler;

import com.yzeng.qf.constant.MessageConstant;
import com.yzeng.qf.pojo.model.UserDomain;
import com.yzeng.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Spring security 自定义登录校验
 */
@Component("MyAuthenticationProvider")
public class MyAuthenticationProvider implements AuthenticationProvider {

    private UserService userService; // 查询用户信息的service接口

    @Autowired
    public MyAuthenticationProvider(UserService userService) {
        this.userService = userService;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = (String) authentication.getCredentials();
        // 通过用户名去数据库里查数据
        UserDomain user = userService.getUserInfoByName(username);
        // 登录校验
        if (user == null) {
            throw new UsernameNotFoundException(MessageConstant.Auth.LOGIN_USER_EMPTY);
        }
        if (!user.getPassword().equals(password)) {
            throw new BadCredentialsException(MessageConstant.Auth.LOGIN_PASSWORD_ERROR);
        }
        // 根据角色授予权限
        String[] roles;
        if(user.getRole() == 1) // 1是管理员
            roles = new String[]{"ROLE_ADMIN", "ROLE_USER"};
        else if(user.getRole() == 2)
            roles = new String[]{"ROLE_USER"};
        else
            return null; // 没有角色授权失败
        Collection<GrantedAuthority> authorities = getAuthorities(roles);
        return new UsernamePasswordAuthenticationToken(user, user.getPassword(),
                authorities);
    }

    /**
     * 是否支持处理当前Authentication对象类似
     */
    @Override
    public boolean supports(Class<?> aClass) {
        return UsernamePasswordAuthenticationToken.class.equals(aClass);
    }

    /**
     * 返回权限集合
     * @param roles 权限数组
     * @return 权限集合
     */
    private Collection<GrantedAuthority> getAuthorities(String[] roles) {
        Collection<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        for(String role: roles){
            SimpleGrantedAuthority grantedAuthority = new SimpleGrantedAuthority(role); // 角色必须要以"ROLE_"开头
            grantedAuthorities.add(grantedAuthority);
        }
        return grantedAuthorities;
    }
}
