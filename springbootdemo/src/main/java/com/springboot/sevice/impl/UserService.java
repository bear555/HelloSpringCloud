package com.springboot.sevice.impl;

import com.springboot.dao.UserDao;
import com.springboot.entity.User;
import com.springboot.sevice.IUserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserSevice {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }
}
