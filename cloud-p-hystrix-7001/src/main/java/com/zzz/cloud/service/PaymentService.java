package com.zzz.cloud.service;

import entity.BackMessage;

/**
 * @author zjd
 * @date 2020/12/10
 */
public interface PaymentService {
    BackMessage getOne(Integer id);

    BackMessage getOneSleep(Integer id);

    String paymentCircuitBreaker(Integer id);
}
