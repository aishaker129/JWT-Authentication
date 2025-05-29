package com.jwt.controllers;


import com.jwt.model.User;
import com.jwt.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserServices userServices;

    @GetMapping("/users")
    public List<User> getuser(){

        return this.userServices.getUser();
    }

    @GetMapping("/currentUser")
    public String currentUser(Principal p){
        return p.getName();
    }
}
