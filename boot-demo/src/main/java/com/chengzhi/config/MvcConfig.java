package com.chengzhi.config;

import com.chengzhi.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import javax.annotation.Resource;

/**
 * ${DESCRIPTION}
 *
 * @param
 * @author RCZ
 * @create 2018-01-07 15:27
 */
@EnableWebMvc
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter{
    @Resource
    private LoginInterceptor loginInterceptor;
    @Bean
    public InternalResourceViewResolver viewResolver () {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/classes/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    }

    /**
     * addResourceHandler 对外暴露的访问路径
     * addResourceLocations 文件放置目录
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/views/");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor);
    }

}
