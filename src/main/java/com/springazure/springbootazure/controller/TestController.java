package com.springazure.springbootazure.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public Object hello() {
        Map<String, String> object = new HashMap<>();
        object.put("name", "Azure Web APPS");
        object.put("email", "sumiitkumar@gmail.com");
        return object;
    }

}