package com.coletti.course.services;

import com.coletti.course.entitities.Category;
import com.coletti.course.entitities.User;
import com.coletti.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    public CategoryRepository  categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();

    }

    public Category findById(Long id) {
        Optional<Category> user = categoryRepository.findById(id);

        return user.get();
    }

}
