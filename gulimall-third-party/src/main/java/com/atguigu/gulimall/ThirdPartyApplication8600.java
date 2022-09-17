package com.atguigu.gulimall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ThirdPartyApplication8600 {
    public static void main(String[] args) {
        SpringApplication.run(ThirdPartyApplication8600.class, args);
    }
}
