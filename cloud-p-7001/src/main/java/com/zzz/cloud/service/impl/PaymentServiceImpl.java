package com.zzz.cloud.service.impl;

import com.zzz.cloud.dao.PaymentDao;
import com.zzz.cloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Date 2020/12/6 17:03
 * @Created by zjd
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;


}
