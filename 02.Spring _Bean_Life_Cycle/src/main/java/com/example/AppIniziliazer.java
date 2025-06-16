package com.example;

import com.example.Config.AppConfig;
import com.example.bean.MyConnection;
import com.example.bean.Springbean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AppIniziliazer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        //jvm ek stop wenakota contex ek close kara gannawa
        context.registerShutdownHook();

        //================api hadapu class ekaka csope eka wenas karanawa==========

//        Springbean bean = context.getBean(Springbean.class);
//        System.out.println(bean);
//
//        System.out.println("------------------------------------");
//
//        Springbean bean1 = context.getBean(Springbean.class);
//        System.out.println(bean1);


        //===========api pitathin gena bean ekaka scope define karanawa============

//        System.out.println("------------------------------------");
//        MyConnection myConnection = context.getBean(MyConnection.class);
//        System.out.println(myConnection);
//
//        System.out.println("------------------------------------");
//        MyConnection myConnection1 = context.getBean(MyConnection.class);
//        System.out.println(myConnection1);
//
//        context.registerShutdownHook();
    }
}