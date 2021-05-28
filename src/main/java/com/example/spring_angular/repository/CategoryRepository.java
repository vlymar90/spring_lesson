package com.example.spring_angular.repository;

import com.example.spring_angular.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
