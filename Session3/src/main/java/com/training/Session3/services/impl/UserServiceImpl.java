package com.training.Session3.services.impl;

import com.training.Session3.entities.User;
import com.training.Session3.repo.UserRepository;
import com.training.Session3.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

//    private List<User> database = new ArrayList<>(); // acting as my database for now
    private UserRepository userRepository;

    public UserServiceImpl(@Autowired UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User addUser(User user) {

        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User deleteUser(int id) {
        User foundUser = userRepository.findById(id).orElse(null);
        userRepository.deleteById(id);
        return foundUser;
    }

    @Override
    public User findUserByEmail(String email) {
        System.out.println(userRepository.findByEmail(email));
        return userRepository.findByEmail(email);
    }

    @Override
    public List<User> findUsersStartingWithA(Character character) {
        return userRepository.findUsersStartingWithA(character);
    }
}
