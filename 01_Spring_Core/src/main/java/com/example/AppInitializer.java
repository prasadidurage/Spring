package com.example;

import com.example.bean.SpringBean;
import com.example.bean.TestBean1;
import com.example.bean.TestBean2;
import com.example.bean.TestBean3;
import com.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        // methanadi api illuwath natath aniwaren object create karnwa
        
        context.register(AppConfig.class);
        context.refresh();

      SpringBean bean=  context.getBean(SpringBean.class);
      bean.testbean();
      System.out.println(bean);

      TestBean1 testBean1= context.getBean(TestBean1.class);
        System.out.println(testBean1);

        TestBean2 testBean2= context.getBean(TestBean2.class);
        System.out.println(testBean2);

        context.close();
        TestBean3 testBean3= context.getBean(TestBean3.class);
        System.out.println(testBean3);
    }
}
