package com.cii.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
    "com.cii.restservice",
    "com.cii.model",
    "com.cii.exception",
    "com.cii.form",
    "com.cii.job",
    "com.cii.json",
    "com.cii.jwt",
    "com.cii.pdf",
    "com.cii.question"})
public class RestServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestServiceApplication.class, args);
    }
}
