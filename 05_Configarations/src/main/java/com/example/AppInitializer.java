package com.example;

import com.example.bean.SpringBeanOne;
import com.example.bean.SpringBeanTwo;
import com.example.config.AppConfig1;
import com.example.config.AppConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig1.class);
//        context.register(AppConfig2.class);

        context.refresh();
// SpringBeanOne cheak karanawa
        SpringBeanOne bean1 = context.getBean(SpringBeanOne.class);
        SpringBeanOne bean2 = context.getBean(SpringBeanOne.class);
        System.out.println(bean1);
        System.out.println(bean2);

// SpringBeanTwo cheak karanawa
        SpringBeanTwo bean3 = context.getBean(SpringBeanTwo.class);
//Singletonda kyl cheak karanna thmai me deparak danne
        SpringBeanTwo bean4 = context.getBean(SpringBeanTwo.class);

        System.out.println(bean3);
        System.out.println(bean4);

        context.registerShutdownHook();
    }
}