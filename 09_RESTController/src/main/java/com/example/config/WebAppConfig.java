package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ImportResource
@ComponentScan(basePackages = {"com.example.bean", "com.example.controller"})
@EnableWebMvc
public class WebAppConfig {


}
