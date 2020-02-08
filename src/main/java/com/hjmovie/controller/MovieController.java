package com.hjmovie.controller;

import com.hjmovie.common.base.Result;
import com.hjmovie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping(value = "movie/list")
    public Result getMovieList(){
        return movieService.getMovieList();
    }
}
