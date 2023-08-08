package com.shoppingcart.productservice.service;

import com.shoppingcart.productservice.entity.Product;
import com.shoppingcart.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product find(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> findAll(List<Long> ids) {
        return productRepository.findAllById(ids);
    }

    @Override
    public List<Product> findAll(Sort sort){
        return productRepository.findAll(sort);
    }

    @Override
    public Page<Product> findAll(Pageable pageable){
        return productRepository.findAll(pageable);
    }

    @Override
    public void delete(Long id) {
    productRepository.deleteById(id);
    }

    @Override
    public void delete(List<Product> product) {
        productRepository.deleteAll(product);
    }

    @Override
    public void delete(Product product) {
        productRepository.delete(product);
    }

    @Override
    public void deleteAll() {
        productRepository.deleteAll();
    }

    @Override
    public long count() {
        return productRepository.count();
    }

}