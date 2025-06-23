package com.example.config;


import com.example.bean.SpringBeanOne;
import com.example.bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration


@ComponentScan(basePackages = "com.example.bean")
public class AppConfig {


    //=============================================================================================//
    //meka Full mode Spring mode ekka
    // methanadi interbean dependancy satisfy karanawa
    //============================================================================================//



//    @Bean
//    public SpringBeanOne springBeanOne() {
////        SpringBeanOne springBeanOne = new SpringBeanOne();
//        // spring wala api new key word ek dala hadanne nh
//
//
////        SpringBeanOne springBeanOne = new SpringBeanOne();
////        SpringBeanTwo springBeanTwo = new SpringBeanTwo();
//
//        SpringBeanTwo springBeanOne =  springBeanTwo();
//        SpringBeanTwo springBeanTwo = springBeanTwo();
//        System.out.println(springBeanOne);
//        System.out.println(springBeanTwo);
//        return new SpringBeanOne();
//
//    }
//
//    @Bean
//    public SpringBeanTwo springBeanTwo() {
//        return new SpringBeanTwo();
//    }

}
