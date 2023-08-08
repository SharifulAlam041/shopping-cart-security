package com.shoppingcart.orderservice.entity;

import jakarta.persistence.*;

import lombok.*;


@Entity
@Table(name = "order_info")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    private String name;

    private Long productId;

    private Integer productQuantity;
}
