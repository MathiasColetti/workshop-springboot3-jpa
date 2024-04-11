package com.coletti.course.repositories;

import com.coletti.course.entitities.Category;
import com.coletti.course.entitities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
