package com.zzz.cloud.service;

import entity.BackMessage;

/**
 * @date  2020/12/6 16:50
 * @author  by zjd
 */
public interface PaymentService {
    BackMessage getPayment(Integer id);

    void test();
}
