package com.danial.spring.dao;

import com.danial.spring.model.User;

import java.util.List;

public interface UserDao {

    public User get(int id);

    public List<User> getALL();

    public void addOrUpdate(User user);

    public void delete(int id);
}
