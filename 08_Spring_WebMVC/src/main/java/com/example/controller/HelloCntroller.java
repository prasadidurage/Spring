package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController// dispatch arann oni controller idendify karangnnwa
//@Controller----------> mekedi mvc wala use karai
@Controller
@RequestMapping("hello")
public class HelloCntroller {
    public HelloCntroller() {

        System.out.println("HelloCntroller Constructor" );
    }

    @GetMapping()
    public String hello() {
       return "index";
        //return "Hello World one";
    }
//
//    @GetMapping("two")
//    public String hello2() {
//        return "Hello World Two";
//    }
}
