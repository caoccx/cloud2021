package com.itcc.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by caocaixia on 2021/2/25 18:51
 */
@RestController
@Slf4j
public class ConsumerConsulController {

    public static final String CONSUL_URL = "http://consul-provider-payment";

    @Resource
    RestTemplate restTemplate;

    @Value("${server.port}")
    String serverPort;


    @GetMapping("/consumer/payment/consul")
    public String getConsulInfo(){
        String result = restTemplate.getForObject(CONSUL_URL+"/payment/consul", String.class);
        return result;
    }
}
