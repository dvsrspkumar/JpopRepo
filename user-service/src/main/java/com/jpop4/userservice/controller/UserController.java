package com.jpop4.userservice.controller;

import com.jpop4.userservice.model.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/users")
@RefreshScope
public class UserController {

    @HystrixCommand(fallbackMethod = "getUserFallback")
    @GetMapping
    public List<User> getUser() {

        User user = new User(101, "Pavan", "Hyderabad", 30, "Male");
        return Collections.singletonList(user);
    }

    private List<User> getUserFallback() {
        System.out.println("User service is down and not working now...");
        User user = new User(101, "Pavan", "Hyderabad", 30, "Male");
        return Collections.singletonList(user);
    }

    @GetMapping("/{user_id}")
    public User getUserById(@PathVariable("user_id") Integer userId) {
        return null;
    }

    @PostMapping
    public void addUser(User user) {

    }

    @DeleteMapping("/{user_id}")
    public void deleteUser(@PathVariable("user_id") Integer userId) {

    }

    @PutMapping("/{user_id}")
    public void updateUser(@PathVariable("user_id") Integer userId) {

    }
}
