package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AppService {

    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private int appVersion;

    @Value("${app.active}")
    private boolean appActive;

    @PostConstruct
    public void printInfo() {
        System.out.println(appName);
        System.out.println(appVersion);
        System.out.println(appActive);
    }
}