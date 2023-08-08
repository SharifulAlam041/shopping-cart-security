package com.shoppingcart.orderservice.Dto;

import com.shoppingcart.orderservice.entity.OrderInfo;
import com.shoppingcart.orderservice.entity.Product;
import lombok.Data;

@Data
public class OrderResponseDto {

    private OrderInfo order;

    private Product product;

}
