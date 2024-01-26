package com.danial.spring.dao;

import com.danial.spring.model.User;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao{

    @PersistenceContext
    private EntityManager entityManager;



    @Override
    public List<User> getALL() {
       return entityManager.createQuery("From User user").getResultList();
    }

    @Override
    public void add(User user) {
        entityManager.persist(user);
        entityManager.close();
    }

    @Override
    public void edit(User user) {

    }

    @Override
    public void delete(int id) {

    }
}
