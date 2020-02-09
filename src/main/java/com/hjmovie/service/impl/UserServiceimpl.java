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

    @Override
    public Result editUser(UserDo userDo) {
        return Result.success(userMapper.editUser(userDo));
    }

    @Override
    public Result delUser(Integer id) {
        return Result.success(userMapper.delUser(id));
    }

    @Override
    public Result getUserDetail(Integer id) {
        return Result.success(userMapper.getUserDetail(id));
    }
}
