package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration()
public class TestComponent {
    @Bean
    public String getUUID() {
        return "";
    }

    @Bean
    public String getHalfUUID() {
        return getUUID() + "half";
    }
}
