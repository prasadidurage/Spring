package com.example.config;

import com.example.bean.Bean_C;
import com.example.bean.Springbean;
import org.springframework.context.annotation.*;

@Configuration

@Import({AppConfig1.class, Appconfig2.class})
@ComponentScan(basePackages = "com.example.bean")


// cofig file ek root folder eke tyi nm
//@ImportResource("classpath:hibernate.cfg.xml")

//if not in th root
//@ImportResource("file:absolute-path-of-hibernate.cfg.xml")

public class AppConfig {
    @Bean
    public Springbean springbean() {
        return new Springbean();
    }
}
