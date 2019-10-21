package com.byd.dao;

import com.byd.entity.User;


public interface UserDao {
    //根据工号获取姓名
    User queryByNum(int number);
}
