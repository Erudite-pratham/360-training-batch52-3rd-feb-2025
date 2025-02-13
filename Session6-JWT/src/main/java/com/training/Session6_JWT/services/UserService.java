package com.training.Session6_JWT.services;

import com.training.Session6_JWT.enitites.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private final List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "Pratham", "abc@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Pratham2", "abc2@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Pratham3", "abc3@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Pratham4", "abc4@gmail.com"));
    }


    public List<User> getUsers() {
        return this.store;
    }
}
