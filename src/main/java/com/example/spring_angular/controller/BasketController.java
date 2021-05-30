package com.example.spring_angular.controller;

import com.example.spring_angular.dto.ProductDto;
import com.example.spring_angular.service.BasketService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/basket")
public class BasketController {
    private BasketService basketService;
     @GetMapping
    public List<ProductDto> findAll() {
         return basketService.getBasket();
     }

     @GetMapping("/{id}")
     public void addProduct(@PathVariable Long id) {
         basketService.addProductBasket(id);
     }

     @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
         basketService.deleteProductFromBasket(id);
     }
}
