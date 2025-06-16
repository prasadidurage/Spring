package com.example.Config;


import com.example.bean.MyConnection;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration


@ComponentScan(basePackages = "com.example.bean")
public class AppConfig {

    @Bean
   // @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) mekama tama pahala wenne annotation ekt assing krn vif=dh vitharai wenasa
  @Scope("prototype")
//    @Scope("singleton")// mekedi life cycle tika okkoma print wenawa
   MyConnection getMyConnection() {
       return new MyConnection();
  }

}
