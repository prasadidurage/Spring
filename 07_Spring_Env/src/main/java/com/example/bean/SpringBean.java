package com.example.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Component
//@ImportResource("file:absolute-path-of-application.properties")

public class SpringBean implements InitializingBean {

    public SpringBean() {
        System.out.println("SpringBean");
    }

    @Value("${os.name}")
    private String osName;

    @Value("${PROCESSOR_LEVEL}")
    private int PROCESSOR_LEVEL;

    @Value("${USERDOMAIN}")
    private String USERDOMAIN;

    @Value("${db.name}")
    private String name;

    @Value("${db.user}")
    private String user;

    @Value("${db.password}")
    private String password;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(PROCESSOR_LEVEL);
        System.out.println(osName);
        System.out.println(USERDOMAIN);
        System.out.println(name);
        System.out.println(user);
        System.out.println(password);
    }
}
