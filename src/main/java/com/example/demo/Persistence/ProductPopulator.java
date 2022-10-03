package com.example.demo.Persistence;

import com.example.demo.Domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Arrays;

@Repository
public class ProductPopulator implements CommandLineRunner {
    @Autowired
    private ProductRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.deleteAll();

        repository.saveAll(
                Arrays.asList(new Product("Biscuit", BigDecimal.valueOf(10))
                        , new Product("Diamond Biscuit", BigDecimal.valueOf(15))
                        , new Product("Lays", BigDecimal.valueOf(25))
                        , new Product("Lays", BigDecimal.valueOf(35))
                        , new Product("Croissant", BigDecimal.valueOf(35))
                        , new Product("Croissant Jam", BigDecimal.valueOf(35))
                )
        );
    }
}
