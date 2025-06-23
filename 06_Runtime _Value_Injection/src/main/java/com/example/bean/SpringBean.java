package com.example.bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {

    //========================================02==================================================

    @Value("san")
    private String name;
    public SpringBean() {
        // methanadi api initialize vithatrak karai
        System.out.println("name is " + name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // property ekt valueset karai
        System.out.println("name is " + name);
    }

//========================================01==================================================
//   // public SpringBean() {}
//   @Autowired(required=false)
//    public SpringBean(@Value("udara")String  name,@Value("23") int age,@Value("false")boolean bool) {
//        System.out.println("SpringBean : "+name +" "+age +" "+bool);
//
//    }
//@Autowired(required=false)
//
//    public SpringBean(@Value("malindu")String  name,@Value("22") int age) {
//        System.out.println("SpringBean : "+name +" "+age +" ");
//
//    }
}
