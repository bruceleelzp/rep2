package com.lzp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com")//这是一个springBoot应用
public class Application {
    public static void main(String[] args) {
        System.out.println("lzp");

        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);


    }
}
