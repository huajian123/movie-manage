package com.hjmovie.service;

import com.hjmovie.common.base.Result;
import com.hjmovie.dao.entity.MovieDo;

public interface MovieService {
    Result getMovieList();

    Result addMovie(MovieDo movieDo);

    Result delMovie(Integer id);
}
