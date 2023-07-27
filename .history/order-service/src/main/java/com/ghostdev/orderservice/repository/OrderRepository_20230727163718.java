package com.ghostdev.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ghostdev.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
