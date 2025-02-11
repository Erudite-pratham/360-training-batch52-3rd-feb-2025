package com.training.Session3.services;

import com.training.Session3.entities.User;

import java.util.List;

public interface UserService {

    // add user
    User addUser(User user);

    // get all users
    List<User> getAllUsers();

    // delete user by id
    User deleteUser(int id);
}
