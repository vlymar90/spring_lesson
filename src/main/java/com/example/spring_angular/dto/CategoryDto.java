package com.example.spring_angular.dto;


import lombok.Data;
import java.util.List;

@Data
public class CategoryDto {
    private Long id;
    private String title;
    private List<ProductDto> productsList;
}
