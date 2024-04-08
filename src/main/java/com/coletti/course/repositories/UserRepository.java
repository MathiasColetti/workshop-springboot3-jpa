package com.coletti.course.repositories;

import com.coletti.course.entitities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
