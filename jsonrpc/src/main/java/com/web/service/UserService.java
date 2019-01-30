package com.web.service;

import com.web.model.User;

/**
 * Created by Kelly on 2019/1/30.
 */
public interface UserService {
    User createUsers(String userName, String firstName, String password);
    String createUser(String userName, String password);
    String findUserByUserName(String userName);
    int getUserCount();
}
