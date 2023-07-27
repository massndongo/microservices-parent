package com.ghostdev.orderservice.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.ghostdev.orderservice.dto.OrderLineItemsDto;
import com.ghostdev.orderservice.dto.OrderRequest;
import com.ghostdev.orderservice.model.Order;

@Service
public class OrderService {

    public void placeOrder(OrderRequest orderRequest){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        orderRequest.getOrderLineItemsDto()
            .stream()
            .map(orderLineItemsDto -> mapToDto(orderLineItemsDto))
        ;
    }

    private Order mapToDto(OrderLineItemsDto orderLineItemsDto) {
        return null;
    }
    
}
