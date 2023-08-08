package com.shoppingcart.orderservice.service;

import com.shoppingcart.orderservice.entity.OrderInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface OrderService {

    OrderInfo save(OrderInfo order);

    OrderInfo find(Long id);

    List<OrderInfo> findAll();

    List<OrderInfo> findAll(List<Long> ids);

    List<OrderInfo> findAll(Sort sort);

    Page<OrderInfo> findAll(Pageable pageable);

    void delete(Long id);

    void delete(List<OrderInfo> order);

    void delete(OrderInfo order);

    void deleteAll();

    long count();

}