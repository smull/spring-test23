package com.levelup.spring.service;

import com.levelup.spring.model.user.User;

import java.util.List;

/**
 * Created by java on 31.03.2015.
 */
public interface UserService {

    void createUser(User user);

    User getUserById(Long id);
    User getUserByName(String firstName, String lastName);

    List<User> getAllUsers();

    User deleteById(Long id);

    User update(Long id, String firstName, String lastName, Integer age);
}
