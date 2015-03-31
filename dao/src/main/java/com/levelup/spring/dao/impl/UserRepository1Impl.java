package com.levelup.spring.dao.impl;

import com.levelup.spring.dao.UserRepository;
import com.levelup.spring.model.user.User;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by java on 31.03.2015.
 */
@Repository("userRepository")
public class UserRepository1Impl implements UserRepository {

    private HashMap<Long, User> usersMap = new HashMap<>();




    @PostConstruct
    private void init() {
        User user1 = new User();
        user1.setId(1L);
        user1.setFirstName("Ivan");
        user1.setLastName("Ivanov");
        user1.setAge(13);
        usersMap.put(1L, user1);

        user1 = new User();
        user1.setId(2L);
        user1.setFirstName("Petr");
        user1.setLastName("Petrov");
        user1.setAge(52);
        usersMap.put(2L, user1);

        user1 = new User();
        user1.setId(3L);
        user1.setFirstName("Sam");
        user1.setLastName("Neil");
        user1.setAge(65);
        usersMap.put(3L, user1);
    }


    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();

        users.addAll(usersMap.values());
        return users;
    }



    @Override
    public void createUser(User user) {
        usersMap.put(user.getId(),user);
    }

    @Override
    public User getUserById(Long id) {
        return usersMap.get(id);
    }

    @Override
    public User getUserByName(String firstName, String lastName) {
        return null;
    }



    @Override
    public User deleteById(Long id) {
        return usersMap.remove(id);
    }

    @Override
    public User update(Long id, String firstName, String lastName, Integer age) {
        User user = new User();
        if(usersMap.containsKey(id) ){
            user = usersMap.get(id);
            usersMap.remove(id);
        }
        user.setId(id);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);
        usersMap.put(user.getId(),user);
        return user;
    }
}
