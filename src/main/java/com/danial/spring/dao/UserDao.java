package com.danial.spring.dao;

import com.danial.spring.model.User;
import com.google.protobuf.Empty;

import java.util.List;

public interface UserDao {
    public List<User> getALL();

    public void add(User user);

    public void edit(User user);

    public void delete(int id);
}
