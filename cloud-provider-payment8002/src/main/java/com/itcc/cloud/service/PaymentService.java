package com.itcc.cloud.service;

import com.itcc.cloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * Created by caocaixia on 2021/2/23 16:02
 */
@Service
public interface PaymentService {
    public int createPayment(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
