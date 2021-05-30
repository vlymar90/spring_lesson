package com.example.spring_angular.controller;


import com.example.spring_angular.dto.ProductDto;
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

    @GetMapping()
    public List<Products> getAllProduct(@RequestParam(name = "page") int page) {
        return productService.findAllProduct(page);
    }

    @GetMapping("/{id}")
    public Products getProduct(@PathVariable Long id) {
        return productService.getProduct(id);
    }

    @DeleteMapping("/{id}")
    public void removeProductById(@PathVariable Long id) {
        productService.deleteProductById(id);
    }

    @PostMapping
    public Long addProduct(@RequestBody ProductDto products) {
        return productService.save(products);
    }

    @PutMapping("/{id}")
    public Long upDate(@RequestBody ProductDto products) {
        return productService.save(products);
    }
}
