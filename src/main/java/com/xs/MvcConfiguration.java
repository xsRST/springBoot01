package com.xs;

import com.xs.Interceptors.LogInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * mvc 配置
 * @author 75612
 */
@Configuration
public class MvcConfiguration extends WebMvcConfigurerAdapter{

    /**
     * 配置拦截登录器
     * @return
     */
    @Bean
    public LogInterceptor logInterceptor(){
        return new LogInterceptor();
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加拦截器与放行资源
        registry.addInterceptor(logInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/login","/register","/exit");
    }
}
