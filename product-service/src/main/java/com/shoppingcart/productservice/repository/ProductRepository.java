package com.shoppingcart.productservice.repository;

import com.shoppingcart.productservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}