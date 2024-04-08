package com.coletti.course.resources;

import com.coletti.course.entitities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "MAthias", "mathiasc2004@gmail.com", "99999999", "123456");
        return ResponseEntity.ok().body(u);
    }

}
