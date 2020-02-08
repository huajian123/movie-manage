package com.hjmovie.controller;

import com.hjmovie.common.base.Result;
import com.hjmovie.dao.entity.UserDo;
import com.hjmovie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "user/list")
    public Result findAll() {
        return userService.findAll();
    }

    @PostMapping(value = "user/add")
    public Result addUser(@RequestBody UserDo userDo) {
        System.out.println(userDo.toString());
        System.out.println("111111111111111");
        return userService.addUser(userDo);
    }
}
