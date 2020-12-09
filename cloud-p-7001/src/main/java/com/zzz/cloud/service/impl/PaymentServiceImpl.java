package com.zzz.cloud.service.impl;

import com.zzz.cloud.dao.PaymentDao;
import com.zzz.cloud.service.PaymentService;
import entity.BackMessage;
import entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @date  2020/12/6 16:50
 * @author  by zjd
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Value("${server.port}")
    private Integer serverPort;

    @Override
    public BackMessage getPayment(Integer id) {
        Payment one = paymentDao.getOne(id);
        BackMessage message = new BackMessage("yes,serverPort:"+serverPort,one);
        return message;
    }

    @Override
    public void test() {
        List<Payment> payments = new ArrayList<>();
        for (int i = 0; i < 10000 ; i++) {
            Payment payment = new Payment();
            payment.setName("app"+i);
            payments.add(payment);
        }

        paymentDao.insertList(payments);
        System.out.println(payments);
    }
}
