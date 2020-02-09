package com.hjmovie.controller;

import com.hjmovie.common.base.Result;
import com.hjmovie.dao.entity.MovieDo;
import com.hjmovie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping(value = "movie/list")
    public Result getMovieList(){
        return movieService.getMovieList();
    }

    @PostMapping(value = "movie/add")
    public Result addMovie(@RequestBody MovieDo movieDo) {
        return movieService.addMovie(movieDo);
    }
}
