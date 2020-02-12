package com.yzeng.qf.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 暂时关掉csrf跨域拦截
        http.csrf().disable();
        http.headers().frameOptions().sameOrigin();
        // login页面所有人可以访问
        http.authorizeRequests()
                .antMatchers("/admin/login").permitAll()
                .antMatchers("/admin/index.html").permitAll();
    }
}
