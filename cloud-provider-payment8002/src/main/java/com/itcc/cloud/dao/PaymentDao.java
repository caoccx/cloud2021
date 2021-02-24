package com.itcc.cloud.dao;

import com.itcc.cloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by caocaixia on 2021/2/23 15:39
 *
 */

@Mapper
public interface PaymentDao {

    public int createPayment(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
