package com.coletti.course.services;

import com.coletti.course.entitities.User;
import com.coletti.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    public UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();

    }

    public User findById(Long id) {
        Optional<User> user = userRepository.findById(id);

        return user.get();
    }

}
