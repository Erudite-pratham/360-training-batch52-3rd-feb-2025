package com.training.UserService.services.impl;

import com.training.UserService.entities.User;
import com.training.UserService.repositories.UserRepository;
import com.training.UserService.services.ProductClient;
import com.training.UserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductClient productClient;

    @Override
    public User add(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAll() {
        List<User> users = userRepository.findAll();

        List<User> newUserList = users.stream().map(user -> {
            user.setProducts(productClient.getProductsByUser(user.getId()));
            return user;
        }).collect(Collectors.toList());
        return newUserList;
    }

    @Override
    public User getOne(int id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        user.setProducts(productClient.getProductsByUser(user.getId()));
        return user;
    }
}
