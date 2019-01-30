package com.web.service.Impl;

import com.web.model.User;
import com.web.service.UserService;

/**
 * Created by Kelly on 2019/1/30.
 */
public class UserServiceImpl implements UserService{

    public User createUser(String userName, String firstName, String password) {
        User user = new User();
        user.setUserName(userName);
        user.setFirstName(firstName);
        user.setPassword(password);
//        database.saveUser(user);
        return user;
    }

    public User createUser(String userName, String password) {
        return this.createUser(userName, null, password);
    }

    public User findUserByUserName(String userName) {
//        return database.findUserByUserName(userName);
        return null;
    }

    public int getUserCount() {
//        return database.getUserCount();
        return 0;
    }

}
