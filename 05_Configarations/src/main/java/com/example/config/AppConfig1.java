package com.example.config;


import com.example.bean.SpringBeanOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AppConfig2.class})
@ComponentScan(basePackages = "com.example.bean")
public class AppConfig1 {

    @Bean
    public SpringBeanOne springBeanOne(){
        return new SpringBeanOne();
    }
}
