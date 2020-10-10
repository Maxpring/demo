package com.zjrcu.alan.config;

import com.zjrcu.alan.interceptor.LoginHandlerInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@Slf4j
public class MyMVCConfig implements WebMvcConfigurer {

    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        WebMvcConfigurer adaptor = new WebMvcConfigurer() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {

                registry.addViewController("/").setViewName("index");
                registry.addViewController("/index.html").setViewName("index");
                registry.addViewController("/main.html").setViewName("dashboard");
                registry.addViewController("/main").setViewName("dashboard");

            }

            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new LoginHandlerInterceptor())
                        .addPathPatterns("/**")
                        .excludePathPatterns("/index.html", "/", "/user/login", "/asserts/**");
            }
        };
        return adaptor;
    }

    //自定义国际化组件
    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocalResolver();
    }


}
