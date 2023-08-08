package com.shoppingcart.orderservice.controller;

import com.shoppingcart.orderservice.Dto.OrderResponseDto;
import com.shoppingcart.orderservice.client.ProductClient;
import com.shoppingcart.orderservice.entity.OrderInfo;
import com.shoppingcart.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/order-info")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductClient productClient;

    @PostMapping("/save-order")
    public OrderInfo save(@RequestBody OrderInfo order){
        return orderService.save(order);
    }

    @GetMapping("/get-order/{id}")
    public OrderInfo getById(@PathVariable(value = "id") Long id){
        return orderService.find(id);
    }

    @GetMapping("/get-all-orders")
    public List<OrderInfo> getAll(){
        return orderService.findAll();
    }

    @DeleteMapping("/delete-order/{id}")
    public void deleteById(@PathVariable(value = "id") Long id){
        orderService.delete(id);
    }

    @DeleteMapping("/delete-all-orders")
    public void deleteAll(){
        orderService.deleteAll();
    }

    @GetMapping("/number-of-order/count")
    public long count(){
        return orderService.count();
    }

    @GetMapping("/get-all-orders-with-product")
    public List<OrderResponseDto> getAllOrdersWithProduct(){

        List<OrderInfo> orders = orderService.findAll();
        List<OrderResponseDto> orderResponses = new ArrayList<>();

        orders.forEach(x->{
            OrderResponseDto orderResponseDto = new OrderResponseDto();
            orderResponseDto.setOrder(x);
            orderResponseDto.setProduct(productClient.getById(x.getProductId()));
            orderResponses.add(orderResponseDto);
        });
        return orderResponses;
    }
}