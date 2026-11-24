package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class DemoApplication4 {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication4.class, args);

        Person person = context.getBean(Person.class);
        person.greet();

        context.close();
    }

    @Component
    public static class Person {

        public void greet() {
            System.out.println("LOG: Person bean-i cagirildi ve metod isledi!");
        }
    }
}