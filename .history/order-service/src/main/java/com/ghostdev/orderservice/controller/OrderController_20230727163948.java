package com.ghostdev.orderservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ghostdev.orderservice.dto.OrderRequest;
import com.ghostdev.orderservice.service.OrderService;

@RestController

@RequestMapping("/api/order")
public class OrderController {

    private OrderService orderService;

    @PostMapping
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        return "Order Palced Successfully";
    }
    
}
