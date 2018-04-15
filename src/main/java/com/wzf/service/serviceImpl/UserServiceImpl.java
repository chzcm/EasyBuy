package com.wzf.service.serviceImpl;

import com.wzf.dao.UserDao;
import com.wzf.entity.User;
import com.wzf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    public User login(String loginName, String password) {
        return userDao.login(loginName,password);
    }

    @Override
    public void userAdd(User user) {
        userDao.userAdd(user);
    }


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
