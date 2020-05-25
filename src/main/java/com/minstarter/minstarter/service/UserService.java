package com.minstarter.minstarter.service;

import java.util.List;

import com.minstarter.minstarter.model.User;
import com.minstarter.minstarter.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> findAll() {
        return (List<User>) repository.findAll();
    }
    
}