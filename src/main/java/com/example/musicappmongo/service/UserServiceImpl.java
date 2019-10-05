package com.example.musicappmongo.service;

import com.example.musicappmongo.model.User;
import com.example.musicappmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User createUser(User newUser){
        return userRepository.save(newUser);
    }

    @Override
    public List<User> listUsers() {
        return (List<User>) userRepository.findAll();
    }
}
