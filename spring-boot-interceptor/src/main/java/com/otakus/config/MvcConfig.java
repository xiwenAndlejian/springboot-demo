package com.otakus.config;

import com.otakus.interceptor.DemoInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author gx
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Bean
    public DemoInterceptor demoInterceptor() {
        return new DemoInterceptor();
    }

    /**
     * 将创建的拦截器添加到MVC框架中
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截器配置
        registry.addInterceptor(demoInterceptor());
    }
}
