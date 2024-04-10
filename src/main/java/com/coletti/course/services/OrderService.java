package com.coletti.course.services;

import com.coletti.course.entitities.Order;
import com.coletti.course.entitities.User;
import com.coletti.course.repositories.OrderRepository;
import com.coletti.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    public OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();

    }

    public Order findById(Long id) {
        Optional<Order> order = orderRepository.findById(id);

        return order.get();
    }

}
