package com.kubek.kubeksuperduperbot.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FindMeAps5Application {

    public static void main(String[] args) {
        System.setProperty("java.util.logging.config.file", "src/main/resources/logging.properties");
        SpringApplication.run(FindMeAps5Application.class, args);
    }
}
