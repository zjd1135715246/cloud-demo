package com.zzz.cloud.service.impl;

import com.zzz.cloud.dao.PaymentDao;
import com.zzz.cloud.service.PaymentService;
import entity.BackMessage;
import entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @date  2020/12/6 16:50
 * @author  by zjd
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;


    @Override
    public BackMessage getPayment(Integer id) {
        Payment one = paymentDao.getOne(id);
        BackMessage message = new BackMessage("yes",one);
        return message;
    }
}
