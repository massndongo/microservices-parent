package com.ghostdev.orderservice.service;

import java.util.UUID;

import org.hibernate.mapping.List;
import org.springframework.stereotype.Service;

import com.ghostdev.orderservice.dto.OrderLineItemsDto;
import com.ghostdev.orderservice.dto.OrderRequest;
import com.ghostdev.orderservice.model.Order;
import com.ghostdev.orderservice.model.OrderLineItems;

@Service
public class OrderService {

    public void placeOrder(OrderRequest orderRequest){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        List<Order> orderRequest.getOrderLineItemsDto()
            .stream()
            .map(this::mapToDto)
            .toList()
        ;
        order.setOrderLineItems(orderLineItems);
    }

    private OrderLineItems mapToDto(OrderLineItemsDto orderLineItemsDto) {
        OrderLineItems orderLineItems = new OrderLineItems();
        orderLineItems.setPrice(orderLineItemsDto.getPrice());
        orderLineItems.setQuantity(orderLineItemsDto.getQuantity());
        orderLineItems.setSkuCode(orderLineItemsDto.getSkuCode());
        return orderLineItems;
    }
    
}
