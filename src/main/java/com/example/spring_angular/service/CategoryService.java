package com.example.spring_angular.service;

import com.example.spring_angular.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CategoryService {
    private CategoryRepository categoryRepository;


}
