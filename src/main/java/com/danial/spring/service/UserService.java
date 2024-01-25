package com.danial.spring.service;

import com.danial.spring.model.User;

import java.util.List;

public interface UserService {
    public List<User> getALL();

    public void add(User user);

    public void edit(User user);

    public void delete(int id);
}
