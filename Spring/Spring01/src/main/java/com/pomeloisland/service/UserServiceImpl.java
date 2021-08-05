package com.pomeloisland.service;

import com.pomeloisland.dao.UserDao;
import com.pomeloisland.dao.UserDaoMySqlImpl;
import com.pomeloisland.dao.UserDaoOracleImpl;

public class UserServiceImpl implements UserService{

    private UserDao userDao;
    //利用set进行动态实现值的注入！
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
