package com.alpha.testproject.controller;

import com.alpha.testproject.dto.ProductDto;
import com.alpha.testproject.entity.Product;
import com.alpha.testproject.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    @RequestMapping("/get-products")
    public ResponseEntity<List<Product>> getAllProducts(@RequestParam int pageNo, @RequestParam int pageSize, @RequestParam(defaultValue = "name") String sortBy, @RequestParam boolean asc) {

        List<Product> productList = productService.getAlLProducts(pageNo, pageSize, sortBy, asc);
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @GetMapping
    @RequestMapping("/get-price-range")
    public ResponseEntity<List<Product>> getProductsByPriceRange(@RequestParam double startingPrice, @RequestParam double endPrice) {
        List<Product> productList = productService.findByPriceBetween(startingPrice, endPrice);
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }
}
