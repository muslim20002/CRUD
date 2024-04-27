package web.dao;

import web.model.User;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public User get(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public List getALL() {
        return entityManager.createQuery("From User user").getResultList();
    }

    @Override
    public void addOrUpdate(User user) {
        entityManager.merge(user);
    }


    @Override
    public void delete(int id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
    }
}
