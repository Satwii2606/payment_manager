package com.example.paymentdemo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
@Qualifier("netBanking")
public class NetBankingService implements PaymentService {

    @PostConstruct
    public void init() {
        System.out.println("NetBanking Service Initialized");
    }

    @Override
    public String pay(double amount) {
        return "Paid " + amount + " using Net Banking";
    }

    @PreDestroy
    public void destroy() {
        System.out.println("NetBanking Service Destroyed");
    }
}