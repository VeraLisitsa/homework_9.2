package com.example.homework_9_2.repository;

import com.example.homework_9_2.Authorities;
import com.example.homework_9_2.model.User;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {
    private final ConcurrentHashMap<String, User> listUser = new ConcurrentHashMap<>();

    public UserRepository() {
    }

    public List<Authorities> getUserAuthorities(String user, String password) {

        User userModel = listUser.get(user);
        if (userModel == null || userModel.getPassword().equals(password)) {
            return Collections.emptyList();
        } else {
            return userModel.getAutority();
        }
    }
}