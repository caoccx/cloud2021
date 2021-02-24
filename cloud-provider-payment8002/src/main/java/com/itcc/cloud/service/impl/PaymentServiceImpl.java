package com.itcc.cloud.service.impl;

import com.itcc.cloud.dao.PaymentDao;
import com.itcc.cloud.entities.Payment;
import com.itcc.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by caocaixia on 2021/2/23 16:03
 */

/**
 * Resource 也可以依赖注入
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    PaymentDao paymentDao;

    @Override
    public int createPayment(Payment payment) {
        return paymentDao.createPayment(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
