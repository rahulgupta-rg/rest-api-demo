package com.api.demo.restapi.repository.impl;

import com.api.demo.restapi.model.User;
import com.api.demo.restapi.repository.UserRepository;
import com.api.demo.restapi.utils.PaymentUtil;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Override
    public User createUser(User user) {
        return PaymentUtil.createUser(user);
    }

    @Override
    public User getUser(String userId) {
        return PaymentUtil.getUser(userId);
    }

    @Override
    public Boolean isAuthenticated(String userId, String password) {
        return PaymentUtil.isAuthenticated(userId, password);
    }
}
