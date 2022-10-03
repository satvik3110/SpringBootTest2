package com.example.demo.Controller;

import com.example.demo.Domain.Product;
import com.example.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RequestMapping("/")
@RestController
public class Controller {
    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Product> findAll() {
        return service.getAll();
    }

    @PostMapping("/products")
    public List<Product> addProduct(@RequestBody Product product) {
        service.addProduct(product);
        return findAll();
    }

    @GetMapping(value = "/products", params = "name")
    public List<Product> findByName(String name) {
        return service.findByProductName(name);
    }

    @GetMapping(value = "/products", params = "price")
    public List<Product> findByPrice(BigDecimal price) {
        return service.findByProductPrice(price);
    }
}
