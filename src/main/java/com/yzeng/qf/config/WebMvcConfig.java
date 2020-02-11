package com.yzeng.qf.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/admin","/admin/login");
        registry.addViewController("/admin/login").setViewName("admin/login");
        registry.addViewController("/admin/index.html").setViewName("admin/index");
    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
//                .excludePathPatterns("/admin/login", "/admin/toLogin", "/admin/css/**", "/admin/js/**", "/admin/image/**", "/admin/lib/**");
//    }
}
