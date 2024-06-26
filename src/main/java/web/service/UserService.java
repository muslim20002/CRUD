package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getALL();

    void addOrUpdate(User user);


    void delete(int id);

    User get(int id);
}
