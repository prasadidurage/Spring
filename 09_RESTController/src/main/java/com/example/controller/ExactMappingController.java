package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exact")
public class ExactMappingController {

    @GetMapping(path = "/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping(path = "/hello/two")
    public String helloTwo(){
        return "Hello World Two";
    }

}
