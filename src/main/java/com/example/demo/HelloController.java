package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Magda on 23.08.2017.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHI() {
        return "Siemanko";
    }
}