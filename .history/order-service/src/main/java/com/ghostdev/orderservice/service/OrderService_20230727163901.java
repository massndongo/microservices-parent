package com.ghostdev.orderservice.service;

import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;

import com.ghostdev.orderservice.dto.OrderLineItemsDto;
import com.ghostdev.orderservice.dto.OrderRequest;
import com.ghostdev.orderservice.model.Order;
import com.ghostdev.orderservice.model.OrderLineItems;
import com.ghostdev.orderservice.repository.OrderRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {

    private OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        List<OrderLineItems> orderLineItems = orderRequest.getOrderLineItemsDto()
            .stream()
            .map(this::mapToDto)
            .toList()
        ;
        order.setOrderLineItems(orderLineItems);
        order
    }

    private OrderLineItems mapToDto(OrderLineItemsDto orderLineItemsDto) {
        OrderLineItems orderLineItems = new OrderLineItems();
        orderLineItems.setPrice(orderLineItemsDto.getPrice());
        orderLineItems.setQuantity(orderLineItemsDto.getQuantity());
        orderLineItems.setSkuCode(orderLineItemsDto.getSkuCode());
        return orderLineItems;
    }
    
}
