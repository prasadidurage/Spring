package com.example;

import com.example.bean.*;
import com.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.w3c.dom.ls.LSOutput;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        // methanadi api illuwath natath aniwaren object create karnwa
        
        context.register(AppConfig.class);
        context.refresh();

//      SpringBean bean=  context.getBean(SpringBean.class);
//      bean.testbean();
//      System.out.println(bean);

//      //        // jvm ek shut down wena welawe thama me methord eka trigger wenne
//        Runtime.getRuntime().addShutdownHook(new Thread(()->{
//            System.out.println("JVM is shutting down");
//            context.close();
//        }));


        // me wenuwata mekath liyann puluwan
       // context.registerShutdownHook();

//        TestBean1 testBean1= context.getBean(TestBean1.class);
//        System.out.println(testBean1);
//
//        TestBean2 testBean2= context.getBean(TestBean2.class);
//        System.out.println(testBean2);
//
//
//        // conrex close unata pase bean eka ain wela yanawa context eken
//        //context.close();
//
//        TestBean3 testBean3= context.getBean(TestBean3.class);
//        System.out.println(testBean3);


//
//        TestBean1 testBean1= context.getBean(TestBean1.class);
//        System.out.println(testBean1);
//
//
//        TestBean1 byBeanId = (TestBean1) context.getBean("testBean1");
//        System.out.println(byBeanId);
//
//        TestBean2 byBeanId2 = context.getBean("udara", TestBean2.class);
//        System.out.println(byBeanId2);


        // pe nowana class ekk hanada
        MyConnection connection = (MyConnection) context.getBean("san");
        System.out.println(connection);

        context.registerShutdownHook();

    }

    }

