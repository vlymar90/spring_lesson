package com.example.spring_angular.dto;

import lombok.Data;

@Data
public class ProductDto {
    private Long id;
    private String title;
    private int price;
    private String category;
}
