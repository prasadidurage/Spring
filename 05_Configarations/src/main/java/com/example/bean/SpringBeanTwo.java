package com.example.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanTwo implements DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean {

    public SpringBeanTwo() {
        System.out.println("SpringBean Two Instantiated");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("SpringBean Two setBeanFactory");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("SpringBean Two setBeanName");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBean Two destroy");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBean Two afterPropertiesSet");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SpringBean Two setApplicationContext");

    }
}
