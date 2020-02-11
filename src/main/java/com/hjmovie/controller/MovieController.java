package com.hjmovie.controller;

import com.hjmovie.common.base.Result;
import com.hjmovie.dao.entity.MovieDo;
import com.hjmovie.dao.entity.UserDo;
import com.hjmovie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping(value = "movie/list")
    public Result getMovieList(String movieName, @RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                               @RequestParam(value = "pageSize",defaultValue = "3") int pageSize){
        return movieService.getMovieList(pageNum,pageSize,movieName);
    }

    @PostMapping(value = "movie/add")
    public Result addMovie(@RequestBody MovieDo movieDo) {
        return movieService.addMovie(movieDo);
    }

    @PostMapping(value ="movie/del")
    public Result delUser(@RequestBody MovieDo movieDo) {
        return movieService.delMovie(movieDo.getId());
    }

    @GetMapping(value = "movie/detail")
    public Result getMovieDetail(Integer id) {
        return movieService.getMovieDetail(id);
    }

    @PostMapping(value ="movie/edit")
    public Result editUser(@RequestBody MovieDo movieDo) {
        return movieService.editUser(movieDo);
    }
}
