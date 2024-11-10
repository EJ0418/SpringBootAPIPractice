package com.example.springapitest.service;


import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.example.springapitest.api.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private List<User> userList;

    public UserService(){
        userList = new ArrayList<>();
        User user1 = new User(1, "test1", 10, "test1@mail.com");
        User user2 = new User(2, "test2", 20, "test2@mail.com");
        User user3 = new User(3, "test3", 30, "test3@mail.com");
        User user4 = new User(4, "test4", 40, "test4@mail.com");
        User user5 = new User(5, "test5", 50, "test5@mail.com");

        userList.addAll(Arrays.asList(user1, user2, user3, user4, user5));
    }
    public Optional<User> getUser(Integer id){
        Optional optional = Optional.empty();
        for(User user: userList){
            if(id == user.getId()){
                optional = Optional.of(user);
                return optional;
            }

        }
        return optional;
    }
}