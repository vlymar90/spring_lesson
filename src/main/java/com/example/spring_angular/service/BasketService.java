package com.example.spring_angular.service;

import com.example.spring_angular.dto.DtoBasket;
import com.example.spring_angular.dto.ProductDto;
import com.example.spring_angular.model.Products;
import com.example.spring_angular.repository.ProductRepository;
import com.example.spring_angular.util.ConverterProduct;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class BasketService {
    private DtoBasket basketDto;
    private ProductRepository productRepository;

    public void addProductBasket(Long id) {
        Products product = productRepository.findById(id).orElseThrow(NoSuchElementException::new);
        ProductDto productDto = ConverterProduct.productDtofromProduct(product);
        basketDto.getBasket().add(productDto);
    }

    public void deleteProductFromBasket(Long id) {
        basketDto.getBasket().removeIf(i -> i.getId() == id);
    }

    public List<ProductDto> getBasket() {
        return basketDto.getBasket();
    }
}

