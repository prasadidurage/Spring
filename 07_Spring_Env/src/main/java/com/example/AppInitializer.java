package com.example;

import com.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
System.out.println("================================================= System Properties =====================================================");

        Map<String,String> getenv = System.getenv();
        for (String key : getenv.keySet()) {
            System.out.println(key + "=" + getenv.get(key));
        }

//        System.out.println("================================================= Java Properties =====================================================");
//        //Java enviroment veriable
//        Properties props = System.getProperties();
//        for (String key : props.stringPropertyNames()) {
//            System.out.println(key + "=" + props.getProperty(key));
//        }

//        System.out.println("======================================================================================================");
//        String osname = System.getProperty("os.name");
//        System.out.println(osname);

        context.registerShutdownHook();
    }
}