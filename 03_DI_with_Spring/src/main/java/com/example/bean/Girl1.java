package com.example.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Girl1 implements Agreement{

    public Girl1(){
        System.out.println("Girl constructor");
    }


    @Override
    public void chat() {
        System.out.println("girl1 chattin...........");
    }
}
