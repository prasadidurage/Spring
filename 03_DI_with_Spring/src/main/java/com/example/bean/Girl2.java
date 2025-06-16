package com.example.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//Multiple Bean inject walali ena UnsatisfiedDependencyException ek slove karai
@Primary
@Component
public class Girl2 implements Agreement{
    public Girl2(){

    }
    @Override
    public void chat() {
        System.out.println("Girl2 chat...........");
    }
}
