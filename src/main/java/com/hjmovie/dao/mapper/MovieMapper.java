package com.hjmovie.dao.mapper;

import com.hjmovie.dao.entity.MovieDo;
import com.hjmovie.dao.entity.UserDo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MovieMapper {
    List<MovieDo> getMovieList();

    int addMovie(MovieDo movieDo);

    int delMovie(Integer id);

    MovieDo getMovieDetail(Integer id);

    int editMovie(MovieDo movieDo);
}
