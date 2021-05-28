package com.example.spring_angular.service;


import com.example.spring_angular.model.Products;
import com.example.spring_angular.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class ProductService {
   private ProductRepository productRepository;
   private static final int sizePage = 5;


    public List<Products> findAllProduct(int page) {
        Pageable pageable = PageRequest.of(page, sizePage);
        Page<Products> pagedResult = productRepository.findAll(pageable);
        return pagedResult.toList();
    }

    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }

    public Long save(Products products) {
        return productRepository.save(products).getId();
    }

    public Products getProduct(Long id) {
        return productRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }
}
