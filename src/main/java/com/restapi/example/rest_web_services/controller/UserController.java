package com.restapi.example.rest_web_services.controller;

import com.restapi.example.rest_web_services.DAOService.UserDaoService;
import com.restapi.example.rest_web_services.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    public UserDaoService userDaoService;

    public UserController(UserDaoService userDaoService){
        this.userDaoService = userDaoService;
    }

    @GetMapping("/list")
    public List<User> retreiveAllUsers(){
        return userDaoService.retreiveAllUsers();
    }

    @GetMapping("/search/{id}")
    public User findById(@PathVariable int id){
       return userDaoService.findbyId(id);
    }

    @PostMapping("/createUser")
    public void createUser(@RequestBody User user){
        userDaoService.saveUser(user);
    }
}
