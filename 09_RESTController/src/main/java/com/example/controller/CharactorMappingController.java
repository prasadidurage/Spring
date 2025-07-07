package com.example.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/char")
public class CharactorMappingController {

    @GetMapping(path = "item/I???")
    //EX-------> I123
    //EX-------> IP45
    // aniwaren I akura map wenn oni anik ewa oni chareacter ekk
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping(path = "????/search")
    public String sayHelloGet() {
        return "Hello World search";
    }
}
