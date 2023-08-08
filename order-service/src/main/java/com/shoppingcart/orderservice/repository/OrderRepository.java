package com.shoppingcart.orderservice.repository;

import com.shoppingcart.orderservice.entity.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderInfo, Long> {
}