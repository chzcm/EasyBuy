package com.wzf.service;

import com.wzf.entity.User;

public interface UserService {
    User login(String loginName, String password);
    void userAdd(User user);
}
