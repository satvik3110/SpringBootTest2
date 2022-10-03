package com.example.demo.Persistence;

import com.example.demo.Domain.Product;

import java.math.BigDecimal;
import java.util.List;

public interface ProductRepository extends ModelRepository<Product> {

    List<Product> findByName(String name);

    List<Product> findByPrice(BigDecimal price);
}
