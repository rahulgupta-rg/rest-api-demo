package com.api.demo.restapi.service;

import com.api.demo.restapi.model.User;

public interface UserService {

    User createUser(User user);

    User getUser(String userId);

    Boolean isAuthenticated(String userId, String password);
}
