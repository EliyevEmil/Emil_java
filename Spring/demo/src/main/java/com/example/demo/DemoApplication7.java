package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication7 {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication7.class, args);
        UserService userService = context.getBean(UserService.class);
        userService.istifadeciGoster("Emil");
    }
}