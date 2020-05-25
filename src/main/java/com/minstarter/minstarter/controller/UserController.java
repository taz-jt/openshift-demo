package com.minstarter.minstarter.controller;

import java.util.List;

import com.minstarter.minstarter.model.User;
import com.minstarter.minstarter.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @Autowired
    private IUserService userService;

    @GetMapping("/users")
    public String showUsers(Model model) {
        List<User> users = userService.findAll();
        for(User user:  users) {
            System.out.println(user.toString());
        }
        model.addAttribute("users", users);
        return "show users";
    }

}