package com.example.spring_angular.dto;

import com.example.spring_angular.model.Category;
import lombok.Data;

@Data
public class ProductDto {
    private String title;
    private int price;
    private String category;
}
