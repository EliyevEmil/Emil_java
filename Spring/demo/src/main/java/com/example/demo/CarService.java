package com.example.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    private final ObjectProvider<Engine> engineProvider;

    public CarService(ObjectProvider<Engine> engineProvider) {
        this.engineProvider = engineProvider;
    }

    @PostConstruct
    public void init() {
        System.out.println("CarService yarandi: " + this.hashCode());
    }

    public void sur() {
        Engine e1 = engineProvider.getObject();
        Engine e2 = engineProvider.getObject();
        System.out.println("1-ci muherrik: " + e1.hashCode());
        System.out.println("2-ci muherrik: " + e2.hashCode());
    }

    @PreDestroy
    public void destroy() {
        System.out.println("CarService silindi: " + this.hashCode());
    }
}