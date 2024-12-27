package com.alpha.testproject.controller;

import com.alpha.testproject.dto.ProductDto;
import com.alpha.testproject.entity.Product;
import com.alpha.testproject.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    @RequestMapping("/save-product")
    public ResponseEntity<Product> createProduct(@Valid @RequestBody ProductDto productDto) {
        Product product = new Product();
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());

        Product newProduct = productService.saveProduct(product);

        return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
    }
}
