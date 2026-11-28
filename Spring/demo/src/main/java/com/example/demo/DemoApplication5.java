package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication5 {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner isledici(String kitabMagazasiAdi, Integer maksimumKitabSayi) {
        return args -> {
            System.out.println(kitabMagazasiAdi);
            System.out.println(maksimumKitabSayi);
        };
    }
}