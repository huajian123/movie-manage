package com.hjmovie.service;

import com.hjmovie.common.base.Result;
import com.hjmovie.dao.entity.MovieDo;
import com.hjmovie.dao.entity.UserDo;

public interface MovieService {
    Result getMovieList(int pageNum ,int pageSize);

    Result addMovie(MovieDo movieDo);

    Result delMovie(Integer id);

    Result getMovieDetail(Integer id);

    Result editUser(MovieDo movieDo);
}
