package com.alpha.testproject.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotEmpty;

import java.math.BigDecimal;

public class ProductDto {
    @NotEmpty(message = "Name cannot be null or empty")
    private String name;
    @DecimalMin(value = "0", message = "Price must be greater than 0")
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
