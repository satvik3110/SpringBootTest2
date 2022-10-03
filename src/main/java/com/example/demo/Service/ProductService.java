package com.example.demo.Service;

import com.example.demo.Domain.Product;
import com.example.demo.Persistence.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public class ProductService {
    @Autowired ProductRepository repository;

    public void addProduct(Product product){
        repository.save(product);
    }

    public List<Product> findByProductName(String name){
          return repository.findByName(name);
    }

    public List<Product> getAll(){
        return (List<Product>) repository.findAll();
    }

    public List<Product> findByProductPrice(BigDecimal price){
        return repository.findByPrice(price);
    }
}
