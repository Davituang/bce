package com.heiyo.bce.service.impl;

import com.heiyo.bce.mapper.UserMapper;
import com.heiyo.bce.model.User;
import com.heiyo.bce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User get(Long id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }
}
