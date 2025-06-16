package com.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Boy {
    //===============================//
    // property Injection
//    Girl girl = new Girl();
//    public void chatWithGirl(){
//
//        girl.chat();
//    }

    //===============================//


    //===============================//
    //Contructor true Injection
//    Girl girl;
//    public Boy(Girl girl) {
//        this.girl = girl;
//
//    }
//    public void chatWithGirl() {
//        Boy boy = new Boy(new Girl());
//        girl.chat();
//    }
//}
//===============================//


//===============================//
//setter methord true Injection
//    Girl girl;
//    public setterMethod (Girl girl) {
//        this.girl = girl;
//
//    }
//    public void chatWithGirl() {
//        Boy boy = new Boy();
// boy.setterMethod(new Girl())

//        girl.chat();
//    }
//}
//===============================//
    @Autowired
//Girl girl;// propery injection
        @Qualifier("girl2")//multiple inject wala hamathanama @primay tynwanm haritatma create wena obeject ek define kara ganna meka use kaean bean id eka laba de
    Agreement girl;
    public Boy(){
        System.out.println("Boy conrtuctot");

    }

  public void chathWithGirl()  {
        girl.chat();
  }




}