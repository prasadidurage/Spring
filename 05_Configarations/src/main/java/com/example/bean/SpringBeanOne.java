package com.example.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne implements DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean {

    public SpringBeanOne() {
        System.out.println("SpringBean one Instantiated");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("SpringBean one setBeanFactory");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("SpringBean one setBeanName");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBean one destroy");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBean one afterPropertiesSet");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SpringBean one setApplicationContext");

    }
}
