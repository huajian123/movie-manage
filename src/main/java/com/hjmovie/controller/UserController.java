package com.hjmovie.controller;

import com.hjmovie.common.base.Result;
import com.hjmovie.dao.entity.UserDo;
import com.hjmovie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "user/list")
    public Result findAll(String name, @RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
                          @RequestParam(value = "pageSize", defaultValue = "3") int pageSize) {
        return userService.findAll(pageNum, pageSize,name);
    }

    @PostMapping(value = "user/add")
    public Result addUser(@RequestBody UserDo userDo) {
        return userService.addUser(userDo);
    }

    @PostMapping(value = "user/del")
    public Result delUser(@RequestBody UserDo userDo) {
        return userService.delUser(userDo.getId());
    }

    @PostMapping(value = "user/edit")
    public Result editUser(@RequestBody UserDo userDo) {
        return userService.editUser(userDo);
    }

    @GetMapping(value = "user/detail")
    public Result getUserDetail(Integer id) {
        return userService.getUserDetail(id);
    }
}
