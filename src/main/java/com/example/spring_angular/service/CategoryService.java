package com.example.spring_angular.service;

import com.example.spring_angular.dto.CategoryDto;
import com.example.spring_angular.repository.CategoryRepository;
import com.example.spring_angular.util.ConverterCategory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class CategoryService {
    private CategoryRepository categoryRepository;

    public List<CategoryDto> getCategories() {
       return categoryRepository.findAll().stream().map(ConverterCategory::categoryDtoFromCategory)
                .collect(Collectors.toList());
    }
}
