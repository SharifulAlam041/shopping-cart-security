package com.shoppingcart.orderservice.service;

import com.shoppingcart.orderservice.entity.OrderInfo;
import com.shoppingcart.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public OrderInfo save(OrderInfo order) {
        return orderRepository.save(order);
    }

    @Override
    public OrderInfo find(Long id) {
        return orderRepository.findById(id).get();
    }

    @Override
    public List<OrderInfo> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public List<OrderInfo> findAll(List<Long> ids) {
        return orderRepository.findAllById(ids);
    }

    @Override
    public List<OrderInfo> findAll(Sort sort){
        return orderRepository.findAll(sort);
    }

    @Override
    public Page<OrderInfo> findAll(Pageable pageable){
        return orderRepository.findAll(pageable);
    }

    @Override
    public void delete(Long id) {
    orderRepository.deleteById(id);
    }

    @Override
    public void delete(List<OrderInfo> order) {
        orderRepository.deleteAll(order);
    }

    @Override
    public void delete(OrderInfo order) {
        orderRepository.delete(order);
    }

    @Override
    public void deleteAll() {
        orderRepository.deleteAll();
    }

    @Override
    public long count() {
        return orderRepository.count();
    }

}