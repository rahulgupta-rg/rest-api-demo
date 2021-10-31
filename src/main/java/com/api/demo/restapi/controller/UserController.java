package com.api.demo.restapi.controller;

import com.api.demo.restapi.model.User;
import com.api.demo.restapi.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping(path = "/user")
    public User createUser(@RequestBody User user) {
        System.out.println("Request received Create User: " + System.currentTimeMillis());
        return userService.createUser(user);
    }

    @GetMapping(path = "/user")
    public User getUser( @RequestParam String userId) {
        System.out.println("Request received Get User: " + System.currentTimeMillis());
        return userService.getUser(userId);
    }

    @PostMapping(path = "/authenticate")
    public Boolean isAuthenticated(@RequestBody User user) {
        System.out.println("Request received Authenticate user: " + System.currentTimeMillis());
        return userService.isAuthenticated(user.getUserId(), user.getPassword());
    }
}
