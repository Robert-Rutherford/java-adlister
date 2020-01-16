package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;

import java.util.List;

public interface Users {
    public User findByUsername(String username);

    public Long insert(User user);
}
