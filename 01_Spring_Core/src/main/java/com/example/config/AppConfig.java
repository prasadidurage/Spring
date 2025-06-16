package com.example.config;


import com.example.bean.MyConnection;
import com.example.bean.TestBean1;
import com.example.bean.TestBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration


@ComponentScan(basePackages = "com.example.bean") // bean hadanna oni than specific karagnnwa
//@ComponentScan(basePackageClasses = TestBean1.class)// specific class ekakata vitharak  object create karai
public class AppConfig {
    @Bean("san")
    MyConnection getConnection() {
        return new MyConnection();
    }
}
