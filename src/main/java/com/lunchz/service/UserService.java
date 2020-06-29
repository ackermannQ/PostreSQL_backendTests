package com.lunchz.service;

import com.lunchz.dao.UserDao;
import com.lunchz.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    private final UserDao userDao;

    @Autowired
    public UserService(@Qualifier("fakeDao") UserDao userDao) {
        this.userDao = userDao;
    }

    public int addUser(User user) {
        UUID id = UUID.randomUUID();
        return userDao.insertUser(id, user);
    }
}
