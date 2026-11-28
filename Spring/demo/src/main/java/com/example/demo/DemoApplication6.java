package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication6 {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication6.class, args);
    }

    @Bean
    public CommandLineRunner run(CarService carService) {
        return args -> {
            carService.sur();
        };
    }
}