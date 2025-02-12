package com.training.Session5_Security.services;

import com.training.Session5_Security.entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> list  = new ArrayList<>(); // acting as my database for now

    public UserService(){
        list.add(new User("abc", "abc", "ABC@GMAIL.COM"));
        list.add(new User("xyz", "xyz", "XYZ@GMAIL.COM"));
        list.add(new User("qwe", "qwe", "QWE@GMAIL.COM"));
    }

    public List<User> getAllUsers() {
        return this.list;
    }

    public User getUser(String username) {
        return this.list.stream().filter((user) -> user.getUsername().equals(username)).findAny().orElse(null);
    }

    public User addUser(User user) {
        this.list.add(user);
        return user;
    }
}
