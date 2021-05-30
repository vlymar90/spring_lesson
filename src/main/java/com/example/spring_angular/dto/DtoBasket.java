package com.example.spring_angular.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
@Data
public class DtoBasket {
    private ArrayList<ProductDto> basket;

    public DtoBasket(ArrayList<ProductDto> basket) {
        this.basket = basket;
    }
}
