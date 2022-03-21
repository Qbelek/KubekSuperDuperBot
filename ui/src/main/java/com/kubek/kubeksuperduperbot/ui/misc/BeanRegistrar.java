package com.kubek.kubeksuperduperbot.ui.misc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanRegistrar {

    @Value("${gcp.project-id}")
    private String projectId;


    @Bean
    public TimeManager timeManager() {
        return new TimeManager();
    }

}
