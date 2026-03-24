package com.example.paymentdemo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("netBanking")
public class NetBankingService implements PaymentService {

    public String pay(double amount) {
        return "Paid " + amount + " using Net Banking";
    }
}