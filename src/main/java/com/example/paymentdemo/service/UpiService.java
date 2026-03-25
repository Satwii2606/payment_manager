package com.example.paymentdemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
@Primary
@Lazy   
public class UpiService implements PaymentService {

    @PostConstruct
    public void init() {
        System.out.println("UPI Service Initialized");
    }

    @Override
    public String pay(double amount) {
        return "Paid " + amount + " using UPI";
    }

    @PreDestroy
    public void destroy() {
        System.out.println("UPI Service Destroyed");
    }
}