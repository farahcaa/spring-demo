package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public EntityUser create(@RequestBody EntityUser user) {
        return userRepository.save(user);
    }

    @GetMapping
    public List<EntityUser> findAll() {
        return userRepository.findAll();
    }
}
