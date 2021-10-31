package com.api.demo.restapi.service.impl;

import com.api.demo.restapi.model.User;
import com.api.demo.restapi.repository.impl.UserRepositoryImpl;
import com.api.demo.restapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepositoryImpl userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.createUser(user);
    }

    @Override
    public User getUser(String userId) {
        return userRepository.getUser(userId);
    }

    @Override
    public Boolean isAuthenticated(String userId, String password) {
        return userRepository.isAuthenticated(userId, password);
    }
}
