package com.web.service;

import com.web.model.User;

/**
 * Created by Kelly on 2019/1/30.
 */
public interface UserService {
    User createUser(String userName, String firstName, String password);
    User createUser(String userName, String password);
    User findUserByUserName(String userName);
    int getUserCount();
}
