package com.itcc.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by caocaixia on 2021/2/24 11:16
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced //负载均衡机制
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    /**
     * bean相当于applicationContext.xml <bean id ="" calss=""></bean>
     */
}

