package com.minuth.springrestbasicauth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicRestController {

    @GetMapping("/")
    public String get(){
        return "Hello";
    }

    @GetMapping("/test")
    public String get2(){
        return "Test";
    }
}
