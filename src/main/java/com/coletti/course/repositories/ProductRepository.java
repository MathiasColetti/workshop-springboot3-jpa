package com.coletti.course.repositories;


import com.coletti.course.entitities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
