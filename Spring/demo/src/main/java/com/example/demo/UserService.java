package com.example.demo;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void istifadeciGoster(String ad) {
        System.out.println(userRepository.istifadeciTap(ad));
    }
}