package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("one")
public class WildCardMappingController {

    //--01 one/test/hello -----> unmatching
    //--02 one//hello ----- unmatching
    //--03 one/123/hello -----> unmatching
    //--04 one/test/123/hello ----->matching


    //* wenuwar @ ) wage simble weda karai
    @GetMapping("test/*/hello")
    public String sayHello() {
        return "Wild CardMapping Controller";
    }
// parana vession support karai dn nm nh  meka karanna wena vidihak tye ek passse blmu
//    @GetMapping("hello/**/ijse")
//    public String hello() {
//        return "Wild CardMapping Controller double Star mark";
//    }

//    // meke aniwa pitipassta / ek oni
    @GetMapping("hello/*/*/")
    public String sayHello2() {
        return "Wild CardMapping Controller 2";
    }
}
