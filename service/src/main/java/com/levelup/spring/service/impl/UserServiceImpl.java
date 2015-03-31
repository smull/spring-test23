package com.levelup.spring.service.impl;

import com.levelup.spring.dao.UserRepository;
import com.levelup.spring.model.user.User;
import com.levelup.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by java on 31.03.2015.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public void createUser(User user) {
        userRepository.createUser(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.getUserById(id);
    }

    @Override
    public User getUserByName(String firstName, String lastName) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public User deleteById(Long id) {
        return userRepository.deleteById(id);
    }

    @Override
    public User update(Long id, String firstName, String lastName, Integer age) {
        return userRepository.update(id,firstName,lastName,age);
    }
}
