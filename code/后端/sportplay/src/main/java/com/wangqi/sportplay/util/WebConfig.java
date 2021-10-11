package com.wangqi.sportplay.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ConcurrentTaskExecutor;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.concurrent.Executors;

/**
 * @author wangqi
 * @version 1.0
 * @date 2021/10/9 14:51
 */


/**
 * 处理跨域问题
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addCorsMappings(CorsRegistry registry) {

        /**
         * 1、要访问的路径
         * 2、请求来源
         * 3、方法
         * 4、允许携带
         * 5、最大时间
         */

//        registry.addMapping("/**")
//                .allowedOrigins("http://localhost:8080","null")
//                .allowedMethods("GRT","POST","PUT","OPTIONS","DELETE","HEAD")
//                .allowCredentials(true)
//                .allowedHeaders("*")
//                .maxAge(3600);
        // 设置允许跨域的路由
        registry.addMapping("/**")
                // 设置允许跨域请求的域名
                .allowedOriginPatterns("*")
                // 是否允许证书（cookies）
                .allowCredentials(true)
                // 设置允许的方法
                .allowedMethods("*")
                // 跨域允许时间
                .maxAge(3600);
    }

    @Override
    public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
        configurer.setTaskExecutor(new ConcurrentTaskExecutor(Executors.newFixedThreadPool(3)));
        configurer.setDefaultTimeout(30000);
    }
}
