package com.example.config;

import com.example.bean.Bean_A;
import com.example.bean.Bean_C;
import com.example.bean.Bean_D;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.bean")
public class Appconfig2 {
   @Bean
    public Bean_C beanc(){
        return new Bean_C();
    }

    @Bean
    public Bean_D beand(){
        return new Bean_D();
    }
}
