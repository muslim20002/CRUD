package com.danial.spring.dao;

import com.danial.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Access;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao{

    @PersistenceContext
    private EntityManager entityManager;



    @Override
    public List<User> getALL() {
        return null;
    }

    @Override
    @Transactional
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
