package com.example;

import com.example.bean.SpringBean;
import com.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    context.register(AppConfig.class);
    context.refresh();

        SpringBean bean = context.getBean(SpringBean.class);
        System.out.println(bean);
    context.registerShutdownHook();}
}