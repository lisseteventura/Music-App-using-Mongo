package com.example.musicappmongo.service;

import com.example.musicappmongo.model.User;

import java.util.List;

public interface UserService {

    public User createUser(User newUser);


    public List<User> listUsers();
}
