package com.example;

import com.example.bean.*;
import com.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        Springbean bean = context.getBean(Springbean.class);
        Bean_A beanA = context.getBean(Bean_A.class);
        Bean_B beanB = context.getBean(Bean_B.class);
        Bean_C beanC = context.getBean(Bean_C.class);
        Bean_D beanD = context.getBean(Bean_D.class);

        System.out.println(bean);
        System.out.println(beanA);
        System.out.println(beanB);
        System.out.println(beanC);
        System.out.println(beanD);

        context.registerShutdownHook();
    }
}