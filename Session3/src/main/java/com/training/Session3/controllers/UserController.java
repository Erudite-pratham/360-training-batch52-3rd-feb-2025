package com.training.Session3.controllers;

import com.training.Session3.entities.User;
import com.training.Session3.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(@Autowired UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    // localhost:8080/users/100
    @DeleteMapping("/{id}")
    public User deleteUser(@PathVariable int id){
        return userService.deleteUser(id);
    }
}
