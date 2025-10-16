package com.qualpro.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "World") String name) {
        String result = null;
        try {
            result.length(); // This will throw a NullPointerException
            result = "Hello, " + name + "!";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
        return result;
    }
}