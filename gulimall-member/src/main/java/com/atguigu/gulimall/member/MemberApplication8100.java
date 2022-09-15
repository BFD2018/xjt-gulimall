package com.atguigu.gulimall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.atguigu.gulimall.member.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class MemberApplication8100 {
    public static void main(String[] args) {
        SpringApplication.run(MemberApplication8100.class,args);
    }
}
