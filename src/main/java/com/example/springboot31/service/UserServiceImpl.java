package com.example.springboot31.service;

import com.example.springboot31.dao.UserDao;
import com.example.springboot31.model.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {

        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void addUser(User user) {

        userDao.addUser(user);
    }

    @Override
    @Transactional
    public User updateUser(User user, long id) {

        return userDao.updateUser(user, id);
    }

    @Override
    @Transactional
    public void deleteUser(long id) {

        userDao.deleteUser(id);
    }

    @Override
    public User getUserById(long id) {

        return userDao.getUserById(id);
    }


    @Override
    public List<User> getAllUsers() {

        return userDao.getAllUsers();
    }
}