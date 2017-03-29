package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kameshs
 */
@RestController
public class Greeter {

    @GetMapping(path = "/")
    public String hello() {
        return "Hello! Welcome to OpenShift";
    }
}
