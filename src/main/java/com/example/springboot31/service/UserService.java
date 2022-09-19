package com.example.springboot31.service;


import com.example.springboot31.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void addUser(User user);

    void deleteUser (long id);

    User updateUser(User user, long id);

    User getUserById(long id);

}

