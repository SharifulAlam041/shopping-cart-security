package com.shoppingcart.productservice.controller;

import com.shoppingcart.productservice.entity.Product;
import com.shoppingcart.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/save-product")
    public Product save(@RequestBody Product product){
        return productService.save(product);
    }

    @GetMapping("/get-product/{id}")
    public Product getById(@PathVariable(value = "id") Long id){
        return productService.find(id);
    }

    @GetMapping("/get-all-product")
    public List<Product> getAll(){
        return productService.findAll();
    }

    @DeleteMapping("/delete-product/{id}")
    public void deleteById(@PathVariable(value = "id") Long id){
        productService.delete(id);
    }

    @DeleteMapping("/delete-all-product")
    public void deleteAll(){
        productService.deleteAll();
    }

    @GetMapping("/number-of-products/count")
    public long count(){
        return productService.count();
    }
}