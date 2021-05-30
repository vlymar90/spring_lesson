package com.example.spring_angular.service;


import com.example.spring_angular.dto.ProductDto;
import com.example.spring_angular.model.Category;
import com.example.spring_angular.model.Products;
import com.example.spring_angular.repository.CategoryRepository;
import com.example.spring_angular.repository.ProductRepository;
import com.example.spring_angular.util.ConverterProduct;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductService {
   private ProductRepository productRepository;
   private CategoryRepository categoryRepository;
   private static final int sizePage = 5;


    public List<ProductDto> findAllProduct(int page) {
        Pageable pageable = PageRequest.of(page, sizePage);
        Page<Products> pagedResult = productRepository.findAll(pageable);
        return pagedResult.toList().stream()
                .map(ConverterProduct::productDtofromProduct)
                .collect(Collectors.toList());
    }

    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }

    public Long save(ProductDto productDto) {
        Category category = categoryRepository.findAllByTitle(productDto.getCategory());
        Products products = ConverterProduct.productsFromProductDto(productDto);
        products.setCategory(category);
        return productRepository.save(products).getId();
    }

    public Products getProduct(Long id) {
        return productRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }
}
