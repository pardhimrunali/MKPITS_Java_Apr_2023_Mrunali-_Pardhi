package com.example.demoFirstProjectnew.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @Value("${stud-name}")
    private  String name;
    @GetMapping("/")
            public String display() {
        return "hii"+" "+name;
    }
}
