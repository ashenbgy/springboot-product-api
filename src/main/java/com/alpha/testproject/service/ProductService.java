package com.alpha.testproject.service;

import com.alpha.testproject.entity.Product;
import com.alpha.testproject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAlLProducts(int pageNo, int pageSize, String sortBy, Boolean asc) {

        Sort sort = asc ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();

        PageRequest pageRequest = PageRequest.of(pageNo, pageSize, sort);

        Page<Product> productPage = productRepository.findAll(pageRequest);

        return productPage.getContent();
    }

    public List<Product> findByPriceBetween(double startingPrice, double endPrice) {
        List<Product> productPage = productRepository.findByPriceBetween(startingPrice, endPrice);
        return productPage;
    }

}
