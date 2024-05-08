package com.origin;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.boot.SpringApplication;

import lombok.extern.slf4j.Slf4j;

/**
 * 启动类
 *
 * @author jlf
 */
@SpringBootApplication
@EnableScheduling
@Slf4j
@EnableDiscoveryClient
@EnableFeignClients
public class UserApplication{

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
