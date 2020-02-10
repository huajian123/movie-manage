package com.hjmovie.dao.mapper;

import com.hjmovie.dao.entity.UserDo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserDo> findAll(@Param("name") String name);

    int addUser(UserDo userDo);
    int editUser(UserDo userDo);

    int delUser(Integer id);

    UserDo getUserDetail(Integer id);
}
