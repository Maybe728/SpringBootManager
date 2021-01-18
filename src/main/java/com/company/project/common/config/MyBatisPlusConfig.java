package com.company.project.common.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * mybatis plus config
 *
 * @author SuperHero
 * @version V1.0
 * @date 2020年3月18日
 */
@Configuration
public class MyBatisPlusConfig {
    /**
     * 配置mybatis-plus 分页查件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

//    /**
//     * sql执行效率插件
//     */
//    @Bean
//    @Profile ({"dev","test"}) //设置dev环境和test环境开启
//    public  PerformanceInterceptor performanceInterceptor(){
//        PerformanceInterceptor pi = new PerformanceInterceptor();
//        pi.setMaxTime(100); //设置sql能够执行最大时间，如果超过了则不执行
//        pi.setFormat(true);//是否格式化
//        return new PerformanceInterceptor();
//    }
}