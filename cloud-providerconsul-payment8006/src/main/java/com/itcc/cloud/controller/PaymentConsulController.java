package com.itcc.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by caocaixia on 2021/2/25 18:10
 */
@RestController
@Slf4j
public class PaymentConsulController {

    @Value("${server.port}")
    String serverPort;

    @RequestMapping("/payment/consul")
    public String consulInfo(){
        return "注册到consul："+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
