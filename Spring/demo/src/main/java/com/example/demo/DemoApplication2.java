package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class DemoApplication2 {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication2.class, args);

        PaymentService paymentService = context.getBean(PaymentService.class);
        paymentService.pay(25);
        paymentService.pay(50);

        context.close();
    }

    @Repository
    public static class PaymentRepository {

        public PaymentRepository() {
            System.out.println("LOG: PaymentRepository yarandi!");
        }

        public void savePayment(int amount) {
            System.out.println("LOG: " + amount + " AZN odenis bazaya yazildi!");
        }
    }

    @Service
    public static class PaymentService {

        private final PaymentRepository paymentRepository;

        public PaymentService(PaymentRepository paymentRepository) {
            this.paymentRepository = paymentRepository;
            System.out.println("LOG: PaymentService yarandi!");
        }

        public void pay(int amount) {
            System.out.println("--- Odenis edilir: " + amount + " AZN ---");
            paymentRepository.savePayment(amount);
        }
    }
}