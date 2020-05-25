package com.minstarter.minstarter.service;

import java.util.List;
import com.minstarter.minstarter.model.User;

public interface IUserService {
    List<User> findAll();
}