package com.example.wechatdemo.wechat.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
* 虚拟路径映射
* */
@Configuration
public class WebAppConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/image/goods/**").addResourceLocations("file:D:\\常用文件夹666666666666666666666\\图片\\做项目使用图片\\goods\\");
        registry.addResourceHandler("/image/category/**").addResourceLocations("file:D:\\常用文件夹666666666666666666666\\图片\\做项目使用图片\\category\\");
        registry.addResourceHandler("/image/category/list/**").addResourceLocations("file:D:\\常用文件夹666666666666666666666\\图片\\做项目使用图片\\category\\list\\");
    }
}
