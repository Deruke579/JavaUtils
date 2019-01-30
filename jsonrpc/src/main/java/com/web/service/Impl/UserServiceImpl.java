package com.web.service.Impl;

import com.web.model.User;
import com.web.service.UserService;

/**
 * Created by Kelly on 2019/1/30.
 */
public class UserServiceImpl implements UserService{

    public User createUsers(String userName, String firstName, String password) {
        User user = new User(userName,firstName,password);
//        user.setUserName(userName);
//        user.setFirstName(firstName);
//        user.setPassword(password);
//        database.saveUser(user);
        return user;
    }

    public String createUser(String userName, String password) {
        return "ffffffff";
    }

    public String findUserByUserName(String userName) {
//        return database.findUserByUserName(userName);
        return "ffff";
    }

    public int getUserCount() {
//        return database.getUserCount();
        return 0;
    }

}
