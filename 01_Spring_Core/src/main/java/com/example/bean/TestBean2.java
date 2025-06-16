package com.example.bean;

import org.springframework.stereotype.Component;


// create bean Id 
@Component("udara")
public class TestBean2 {
    public TestBean2() {
        System.out.println("TestBean2 Constructor");

    }
}
