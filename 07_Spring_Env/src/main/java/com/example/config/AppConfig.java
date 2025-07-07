package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.bean")
@PropertySource("classpath:application.properties")
//@ImportResource("classpath:application.properties")
//@ImportResource("file:absolute-path-of-application.properties")


public class AppConfig {
}
