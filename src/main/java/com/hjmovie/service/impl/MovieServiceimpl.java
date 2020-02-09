package com.hjmovie.service.impl;

import com.hjmovie.common.base.Result;
import com.hjmovie.dao.entity.MovieDo;
import com.hjmovie.dao.mapper.MovieMapper;
import com.hjmovie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service()
public class MovieServiceimpl implements MovieService {
    @Autowired
    private MovieMapper movieMapper;

    @Override
    public Result getMovieList() {
        return Result.success(movieMapper.getMovieList());
    }

    @Override
    public Result addMovie(MovieDo movieDo) {
        return Result.success(movieMapper.addMovie(movieDo));
    }
}
