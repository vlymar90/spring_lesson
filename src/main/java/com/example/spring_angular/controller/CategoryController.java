package com.example.spring_angular.controller;

import com.example.spring_angular.dto.CategoryDto;
import com.example.spring_angular.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/category")
@AllArgsConstructor
public class CategoryController {
    private CategoryService categoryService;

    @GetMapping
    public List<CategoryDto> getCategory() {
       return categoryService.getCategories();
    }
}
