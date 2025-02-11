package com.training.Session3.services.impl;

import com.training.Session3.entities.User;
import com.training.Session3.services.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private List<User> database = new ArrayList<>(); // acting as my database for now

    @Override
    public User addUser(User user) {
        this.database.add(user);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return this.database;
    }

    @Override
    public User deleteUser(int id) {
        return null;
    }
}
