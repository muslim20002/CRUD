package com.danial.spring;

import com.danial.spring.dao.UserDaoImp;
import com.danial.spring.model.User;

public class main {
    public static void main(String[] args) {
        UserDaoImp user = new UserDaoImp();
        User user1 = new User("Danial", "Shakhnazarov", 21);
        user.add(user1);
    }

}
