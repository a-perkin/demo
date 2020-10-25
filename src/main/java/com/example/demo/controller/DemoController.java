package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class DemoController {

    @RequestMapping(path = "/orders")
    public String getOrders() {
        String orders = "{\"message\" : \"Java Work!\"}";
        return orders;
    }


}
