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
        //  List<UserDo>
        System.out.println(userMapper.findAll());
        System.out.println("1111111111111111111111");
        // return userMapper.findAll();
        return Result.success(userMapper.findAll());
    }
}
