package com.jwt.services;

import com.jwt.model.User.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserServices {

    private  List<User> store = new ArrayList<>();

    public UserServices() {
        store.add(new User(UUID.randomUUID().toString(),"AI Shaker","aishaker@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Shaker","shaker@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Akhlakul Islam","akhlakulislam@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Akhlakul","akhlakul@gmail.com"));
    }

    public List<User> getUser(){
        return this.store;
    }
}
