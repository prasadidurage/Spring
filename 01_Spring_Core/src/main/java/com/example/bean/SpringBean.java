package com.example.bean;

import org.springframework.stereotype.Component;

@Component

public class SpringBean {
    public SpringBean() {
        System.out.println("SpringBean object created");
    }

    public void testbean(){
        System.out.println("testbean methord created");
    }
}
