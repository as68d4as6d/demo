package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsTestApplication {

    public static void main(String[] args) {
        SpringApplication.run ( JenkinsTestApplication.class, args );
        System.out.println ("-------1-------" +
                "-----------------------------------------");
    }

}
