package com.shoppingcart.productservice.service;

import com.shoppingcart.productservice.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface ProductService {

    Product save(Product product);

    Product find(Long id);

    List<Product> findAll();

    List<Product> findAll(List<Long> ids);

    List<Product> findAll(Sort sort);

    Page<Product> findAll(Pageable pageable);

    void delete(Long id);

    void delete(List<Product> product);

    void delete(Product product);

    void deleteAll();

    long count();

}