package com.hjmovie.dao.entity;

import lombok.Data;

@Data
public class UserDo {
    private int id;
    private String name;
    private String password;
    private String buyMovie;
    private double balance;
}
