package com.cii.restservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
@ComponentScan({
    "com.cii.restservice",
    "com.cii.repository",
    "com.cii.model",
    "com.cii.exception",
    "com.cii.form",
    "com.cii.job",
    "com.cii.json",
    "com.cii.jwt",
    "com.cii.pdf",
    "com.cii.question"})
public class RestServiceApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(RestServiceApplication.class);

    @Autowired
    public void setEnvironment(Environment env) {
        com.cii.repository.RestRepository.config(env);
    }
    
    public static void main(String[] args) {
        SpringApplication.run(RestServiceApplication.class, args);
    }
}
