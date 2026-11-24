package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication3 {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication3.class, args);

        System.out.println("--- Sistemdeki butun bean-ler ---");
        String[] allBeans = context.getBeanDefinitionNames();
        Arrays.sort(allBeans);
        for (String beanName : allBeans) {
            System.out.println(beanName);
        }

        System.out.println("--- Oz yaratdigimiz bean-ler ---");
        for (String beanName : allBeans) {
            Object bean = context.getBean(beanName);
            if (bean.getClass().getPackageName().startsWith("com.example.demo")) {
                System.out.println(beanName + " -> " + bean.getClass().getSimpleName());
            }
        }

        context.close();
    }

    @Component
    public static class MyHelperBean {
    }

    @Service
    public static class MyTestService {
    }
}