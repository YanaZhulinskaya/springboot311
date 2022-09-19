package com.example.springboot31.dao;


import com.example.springboot31.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    void addUser(User user);


    User updateUser(User user, long id);
    User getUserById(long id);

    void deleteUser(long id);
}
