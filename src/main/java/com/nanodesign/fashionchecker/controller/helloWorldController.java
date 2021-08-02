package com.nanodesign.fashionchecker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class helloWorldController {

    @GetMapping("/hello")
    public String getHelloWorld() {
        return "HELLO WORLD";
    }
}
