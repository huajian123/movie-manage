package com.hjmovie.service;

import com.hjmovie.common.base.Result;
import com.hjmovie.dao.entity.UserDo;

public interface UserService {
    Result findAll();

    Result addUser(UserDo userDo);

    Result delUser(Integer id);
}
