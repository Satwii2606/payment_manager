package com.example.paymentdemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class UpiService implements PaymentService {

    public String pay(double amount) {
        return "Paid " + amount + " using UPI";
    }
}