package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public String kitabMagazasiAdi() {
        return "Emil Kitab Evi";
    }

    @Bean
    public Integer maksimumKitabSayi() {
        return 5;
    }
}