package com.training.Session2.config;

import com.training.Session2.Animal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public Animal hello(){
        return new Animal();
    }
}
