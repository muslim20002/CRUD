package com.danial.spring.service;

import com.danial.spring.model.User;

import java.util.List;

public interface UserService {
    public List<User> getALL();

    public void addOrUpdate(User user);


    public void delete(int id);

    public User get(int id);
}
