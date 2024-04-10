package com.coletti.course.repositories;

import com.coletti.course.entitities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
