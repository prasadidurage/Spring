package com.example.bean;

import org.springframework.beans.factory.DisposableBean;

public class MyConnection  implements DisposableBean {
    public MyConnection() {
        System.out.println("MyConnection constructor called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("MyConnection is destroy");

    }
}
