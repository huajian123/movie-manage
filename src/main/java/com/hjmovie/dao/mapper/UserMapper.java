package com.hjmovie.dao.mapper;

import com.hjmovie.dao.entity.UserDo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserDo> findAll();
}
