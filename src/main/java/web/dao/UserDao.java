package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    User get(int id);

    List<User> getALL();

    void addOrUpdate(User user);

    void delete(int id);
}
