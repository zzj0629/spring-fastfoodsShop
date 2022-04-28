package com.example.fastfoods.utils;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//文件磁盘图片url 映射
//配置server虚拟路径，handler为前台访问的目录，locations为files相对应的本地路径
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        //上传的图片在F盘下的uploads目录下，访问路径如：http://localhost:8080/images/2021-05-31/d06a63fd-7245-4dc5-9acc-dc5e001af45e.jpg
        //其中images表示访问的前缀。"file:F:/uploads/"是文件真实的存储路径
        registry.addResourceHandler("/uploadFile/**").addResourceLocations("file:src/main/resources/static/");
    }
}