package com.training.UserService.services;

import com.training.UserService.entities.User;

import java.util.List;

public interface UserService {
    User add(User user);

    List<User> getAll();

    User getOne(int id);
}
