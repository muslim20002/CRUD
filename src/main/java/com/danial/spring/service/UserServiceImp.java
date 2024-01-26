package com.danial.spring.service;

import com.danial.spring.dao.UserDao;
import com.danial.spring.dao.UserDaoImp;
import com.danial.spring.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    UserDao userDao = new UserDaoImp();

    @Override
    @Transactional
    public List<User> getALL() {
        return userDao.getALL();
    }

    @Override
    public void add(User user) {

    }

    @Override
    public void edit(User user) {

    }

    @Override
    public void delete(int id) {

    }
}
