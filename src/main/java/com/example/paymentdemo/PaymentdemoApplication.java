package com.example.paymentdemo;

import com.example.paymentdemo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PaymentdemoApplication implements CommandLineRunner {

    @Autowired
    private PaymentService upiService;

    @Autowired
    @Qualifier("netBanking")
    private PaymentService netBankingService;

    public static void main(String[] args) {
        SpringApplication.run(PaymentdemoApplication.class, args);
    }

    @Override
    public void run(String... args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter amount:");
            double amount = sc.nextDouble();

            System.out.println("Choose payment method:");
            System.out.println("1. UPI");
            System.out.println("2. Net Banking");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println(upiService.pay(amount));
            } else if (choice == 2) {
                System.out.println(netBankingService.pay(amount));
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
