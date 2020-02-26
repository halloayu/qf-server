package com.yzeng.qf.config;

import com.yzeng.qf.handler.MyAuthenticationFailureHandler;
import com.yzeng.qf.handler.MyAuthenticationProvider;
import com.yzeng.qf.handler.MyAuthenticationSuccessHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private final MyAuthenticationSuccessHandler myAuthenticationSuccessHandler;  // 自定义登录成功处理
    private final MyAuthenticationFailureHandler myAuthenticationFailureHandler;  // 自定义登录失败处理
    private final MyAuthenticationProvider myAuthenticationProvider;  // 自定义登录校验

    @Autowired
    public WebSecurityConfig(MyAuthenticationSuccessHandler myAuthenticationSuccessHandler, MyAuthenticationFailureHandler myAuthenticationFailureHandler, MyAuthenticationProvider myAuthenticationProvider) {
        this.myAuthenticationSuccessHandler = myAuthenticationSuccessHandler;
        this.myAuthenticationFailureHandler = myAuthenticationFailureHandler;
        this.myAuthenticationProvider = myAuthenticationProvider;
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        // 放开对静态资源对拦截
        web.ignoring()
                .antMatchers("static/admin/**")
                .antMatchers("static/public/**")
                .antMatchers("static/error/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 暂时关掉csrf跨域拦截
        http.csrf().disable();
        http.headers().frameOptions().sameOrigin();
        // login页面所有人可以访问
        http.authorizeRequests()
                .antMatchers("/admin/login").permitAll()
                .antMatchers("/admin/user").permitAll()
                .antMatchers("/admin/index.html").hasRole("ADMIN")
                .and()
//                .sessionManagement().maximumSessions(1) // 限制登录人数
//                .and()
//                .and()
                .formLogin()
                .successHandler(myAuthenticationSuccessHandler)
                .failureHandler(myAuthenticationFailureHandler)
                .and()
                .formLogin()
                .loginPage("/admin/login").loginProcessingUrl("/admin/toLogin")
                .and()
                .cors(); // 开启跨域

        ;
        // 注销功能
//        http.logout().logoutSuccessUrl("/admin/login").deleteCookies().invalidateHttpSession(true);
        //.defaultSuccessUrl("/admin/toLogin");
        //解决中文乱码问题
//        CharacterEncodingFilter filter = new CharacterEncodingFilter();
//        filter.setEncoding("UTF-8");
//        filter.setForceEncoding(true);
//        http.addFilterBefore(filter,CsrfFilter.class);
    }

    /**
     * 认证
     * There is no PasswordEncoder mapped for the id "null"
     * 内存读取时，密码没被加密会报错～
     * 在 spring security 5.0+ 中新增了很多密码加密到方法～
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(myAuthenticationProvider);
    }

}
