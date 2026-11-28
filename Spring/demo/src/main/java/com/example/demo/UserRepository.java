package com.example.demo;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public String istifadeciTap(String ad) {
        return "Tapilan istifadeci: " + ad;
    }
}