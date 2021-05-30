package com.example.spring_angular.util;

import com.example.spring_angular.dto.ProductDto;
import com.example.spring_angular.model.Products;

public class ConverterProduct {
    private ConverterProduct() {}

    public static Products productsFromProductDto(ProductDto productDto) {
        Products products = new Products();
        products.setTitle(productDto.getTitle());
        products.setPrice(productDto.getPrice());
        return products;
    }

    public static ProductDto productDtofromProduct(Products products) {
        ProductDto productDto = new ProductDto();
        productDto.setId(products.getId());
        productDto.setTitle(products.getTitle());
        productDto.setPrice(products.getPrice());
        productDto.setCategory(products.getCategory().getTitle());
        return productDto;
    }
}
