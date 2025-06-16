package com.example;

import com.example.Config.AppConfig;
import com.example.DI.Test_2;
import com.example.bean.Boy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

//        Boy boy = context.getBean(Boy.class);
//        System.out.println(boy);
//        boy.chathWithGirl();

        Test_2 test_2 = context.getBean(Test_2.class);
        test_2.callHelloMethod();

        context.registerShutdownHook();
    }
}