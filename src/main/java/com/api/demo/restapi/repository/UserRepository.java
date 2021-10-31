package com.api.demo.restapi.repository;

import com.api.demo.restapi.model.User;

public interface UserRepository {

	User createUser(User user);

	User getUser(String userId);

	Boolean isAuthenticated(String userId, String password);
}
