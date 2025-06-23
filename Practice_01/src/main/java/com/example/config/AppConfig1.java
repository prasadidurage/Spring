package com.example.config;

import com.example.bean.Bean_A;
import com.example.bean.Bean_B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.bean")
public class AppConfig1 {

    @Bean
    public Bean_A beanA(){
        return new Bean_A();
    }

    @Bean
    public Bean_B beanB(){
        return new Bean_B();
    }


}
