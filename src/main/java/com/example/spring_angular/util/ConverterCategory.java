package com.example.spring_angular.util;

import com.example.spring_angular.dto.CategoryDto;
import com.example.spring_angular.model.Category;
import com.example.spring_angular.model.Products;

public class ConverterCategory {
    private ConverterCategory() {}

    public static CategoryDto categoryDtoFromCategory(Category category) {
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setTitle(category.getTitle());
        return categoryDto;
    }
}
