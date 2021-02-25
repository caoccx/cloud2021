package com.itcc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by caocaixia on 2021/2/25 18:47
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerConsulMain80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerConsulMain80.class,args);
    }
}
