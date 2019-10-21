package com.byd.service.impl;

import com.byd.dao.UserDao;
import com.byd.entity.User;
import com.byd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(int number) {
        return userDao.queryByNum(number);
    }
}
