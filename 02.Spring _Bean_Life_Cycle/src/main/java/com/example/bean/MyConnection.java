package com.example.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyConnection  implements DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean {
    //life cycle Step 01 ------->the State of the object creation
    public MyConnection() {
        System.out.println("MyConnection constructor called");
    }

    //life cycle Step 02 ------->there  is no  methord to find state of the property

    //life cycle Step 03 ------->Bean Name Awere(Bean id0
    @Override
    public void setBeanName(String name) {
        System.out.println("MyConnection.setBeanName called");

    }
    //life cycle Step 04 ------->Bean Factory Awere(DI)
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("MyConnection.setBeanFactory called");

    }

    //life cycle Step 05 ------->Application Contex  Awere(DP and AOP)
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("MyConnection.setApplicationContext called");

    }

    //life cycle Step 05 ------->iNITIALIZION bean
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyConnection afterPropertiesSet called");

    }

    @Override
    //life cycle Step 07 ------->the State of the object destory
    public void destroy() throws Exception {
        System.out.println("MyConnection is destroy");

    }



}
