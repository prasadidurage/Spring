package com.example.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration


@ComponentScan(basePackages = "com.example.bean") // bean hadanna oni than specific karagnnwa
public class AppConfig {
}
