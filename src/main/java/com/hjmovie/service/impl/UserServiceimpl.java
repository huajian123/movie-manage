package com.hjmovie.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hjmovie.common.base.Result;
import com.hjmovie.dao.entity.UserDo;
import com.hjmovie.dao.mapper.UserMapper;
import com.hjmovie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public class UserServiceimpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Result<PageInfo> findAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<UserDo> userDoList = userMapper.findAll();
        PageInfo<UserDo> pageInfo = new PageInfo<>(userDoList);
        return Result.success(pageInfo);
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
