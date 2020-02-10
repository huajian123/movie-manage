package com.hjmovie.service;

import com.hjmovie.common.base.Result;
import com.hjmovie.dao.entity.UserDo;

public interface UserService {
    Result findAll(int pageNum,int pageSize,String name);

    Result addUser(UserDo userDo);
    Result editUser(UserDo userDo);

    Result delUser(Integer id);

    Result getUserDetail(Integer id);
}
