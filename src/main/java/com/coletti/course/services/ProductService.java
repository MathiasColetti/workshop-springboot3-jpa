package com.coletti.course.services;

import com.coletti.course.entitities.Product;
import com.coletti.course.entitities.User;
import com.coletti.course.repositories.ProductRepository;
import com.coletti.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    public ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();

    }

    public Product findById(Long id) {
        Optional<Product> product = productRepository.findById(id);
        return product.get();
    }

}
