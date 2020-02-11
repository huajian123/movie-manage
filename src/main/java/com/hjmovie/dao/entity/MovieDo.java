package com.hjmovie.dao.entity;

import lombok.Data;

import java.util.Date;
@Data
public class MovieDo {
    private int id;
    private Date releaseTime;
    private int remainVotes;
    private int boxOffice;
    private double price;
    private double score;
    private int votes;
    private String cover;
    private String movieName;
}
