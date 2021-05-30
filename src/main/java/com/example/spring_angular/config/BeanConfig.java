package com.example.spring_angular.config;

import com.example.spring_angular.dto.DtoBasket;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


import java.util.ArrayList;

@Configuration
@ComponentScan("com.example.spring_angular")
public class BeanConfig {

    @Bean
    public DtoBasket basketDto() {
        return new DtoBasket(new ArrayList<>());
    }

}
