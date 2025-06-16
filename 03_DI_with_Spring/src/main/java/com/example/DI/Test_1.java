package com.example.DI;

import org.springframework.stereotype.Component;

@Component
public class Test_1  implements DI{
    public Test_1()  {
        System.out.println("Test_1 constructor called");
    }

    @Override
    public void sayHello() {
        System.out.println("Test_1 hello called");
    }
}
