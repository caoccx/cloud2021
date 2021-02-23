package com.itcc.cloud.controller;

import com.itcc.cloud.entities.CommonResult;
import com.itcc.cloud.entities.Payment;
import com.itcc.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by caocaixia on 2021/2/23 16:07
 */
@RestController
@Slf4j
public class PaumentController {

    @Resource
    PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult createPayment(Payment payment){
        int result = paymentService.createPayment(payment);
        log.info("******插入结果：{}",result);
        if(result > 0){
            return new CommonResult(200,"插入数据库成功",result);
        }else{
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        if (payment != null){
            return new CommonResult(200,"查询成功",payment);
        }else{
            return new CommonResult(444,"没有对应记录,查询id："+id,null);
        }
    }

}
