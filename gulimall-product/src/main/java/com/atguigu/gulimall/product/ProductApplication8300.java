package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@EnableRedisHttpSession     //开启springsession
//@EnableCaching      //开启缓存功能
@EnableDiscoveryClient
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication      //(exclude = GlobalTransactionAutoConfiguration.class)
public class ProductApplication8300 {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication8300.class, args);
    }

}