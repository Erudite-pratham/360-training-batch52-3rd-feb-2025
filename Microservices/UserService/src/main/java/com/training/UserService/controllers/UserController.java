package com.training.UserService.controllers;

import com.training.UserService.entities.User;
import com.training.UserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping
    public User create(@RequestBody User user) {
        return userService.add(user);
    }

    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public User getOne(@PathVariable int id) {
        return userService.getOne(id);
    }
}

