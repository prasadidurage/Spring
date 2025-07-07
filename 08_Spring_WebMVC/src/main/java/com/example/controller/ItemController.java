package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
@RequestMapping("item")
public class ItemController {
    public ItemController() {

    }
@GetMapping
    public String item(){
        return "item";
    }
}
