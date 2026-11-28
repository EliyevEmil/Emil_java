package com.example.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Engine {

    @PostConstruct
    public void init() {
        System.out.println("Engine yarandi: " + this.hashCode());
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Engine silindi: " + this.hashCode());
    }
}