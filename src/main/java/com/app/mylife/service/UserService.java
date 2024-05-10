package com.app.mylife.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.mylife.api.model.User;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();
        
        User user1 = new User(1, "Conor");

        userList.add(user1);
    }

    public User getUser(Integer id) {
        for (User user: userList) {
            if (id == user.getId()) {
                return user;
            }
        }
         return userList.get(0);
    }
}
