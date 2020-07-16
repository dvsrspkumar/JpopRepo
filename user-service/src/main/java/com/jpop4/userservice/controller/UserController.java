package com.jpop4.userservice.controller;

import com.jpop4.userservice.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public List<User> getUser() {
        return null;
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
