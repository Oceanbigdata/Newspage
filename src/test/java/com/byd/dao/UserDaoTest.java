package com.byd.dao;

import com.byd.BaseTest;
import com.byd.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class UserDaoTest extends BaseTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void testQueryByNum() throws Exception {
        int number = 1234567;
        User user = userDao.queryByNum(number);
        System.out.println(user);
    }


}
