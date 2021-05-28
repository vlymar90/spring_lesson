package com.example.spring_angular.controller;


import com.example.spring_angular.model.Products;
import com.example.spring_angular.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    private ProductService productService;

    @GetMapping("/{page}")
    public List<Products> getAllProduct(@PathVariable int page) {
        System.out.println("ok");
        return productService.findAllProduct(page);
    }

    @DeleteMapping("/{id}")
    public void removeProductById(@PathVariable Long id) {
        productService.deleteProductById(id);
    }
}
