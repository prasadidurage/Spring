package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
@RequestMapping("/hii")
public class ExampleController {

    public ExampleController() {}

//    @GetMapping
//    public String hello() {
//        return "Hello World";
//    }

    @GetMapping
    public String hiiGet() {
        return "get Hello ";
    }

    @PostMapping
    public String hiiPost() {
        return "post Hello ";
    }

    @DeleteMapping
    public String hiiDelete() {
        return "delete Hello ";
    }

    @PutMapping
    public String hiiPut() {
        return "put Hello ";
    }
}
