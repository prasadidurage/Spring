package com.example.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test_2  implements DI_Interface{
// -------------------Property Injection /---------------------

//    @Autowired
//    DI test1 ;
//
//
//    public Test_2() {
//        System.out.println("Test_2 constructor called");
//    }
//
//    public void callHelloMethod(){
//        test1.sayHello();
//    }

//========================================================//
    //--------Constructor----------

   // @Autowired // meka aniwarya
//    DI test1;
//
//    public Test_2(DI t1) {
//        this.test1 = t1;
//
//    }
//    public void callHelloMethod() {
//    test1.sayHello();
//    }
 //====================================================//



    // ====================================================//
    //--------------Settrer Methord true DI------------------------

//    @Autowired
//    DI test1;
//
//    public void setterMethord(DI t1) {
//        this.test1 = t1;
//
//    }
//    public void callHelloMethod() {
//        Test_2 test2 = new Test_2();
//        test2.setterMethord(new Test_1());
//        test1.sayHello();
//
//    }
//
//
//
//    }
    // ====================================================//

    // ====================================================//
    //-------------Interface true --------------------------

DI test1;
@Override
@Autowired
public void inject(DI test_1) {
    this.test1 = test_1;

}

public void callHelloMethod(){
    test1.sayHello();
}
    // ====================================================//
}
