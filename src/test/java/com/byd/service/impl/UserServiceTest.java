package com.byd.service.impl;

import com.byd.BaseTest;
import com.byd.entity.User;
import com.byd.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Ocean on 2019/10/17.
 */
public class UserServiceTest extends BaseTest {

    @Autowired
    private UserService userService;

    @Test
    public void testGetUserById() throws Exception{
        User user = userService.getUserById(1234567);
        System.out.println(user);

    }
}
