package com.hjmovie.service.impl;


import com.hjmovie.common.base.Result;
import com.hjmovie.dao.entity.UserDo;
import com.hjmovie.dao.mapper.UserMapper;
import com.hjmovie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceimpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Result findAll() {
        return Result.success(userMapper.findAll());
    }

    @Override
    public Result addUser(UserDo userDo) {
        return Result.success(userMapper.addUser(userDo));
    }
}
