package com.hjmovie.dao.entity;

import java.util.Date;

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

    public MovieDo(){

    }

    public MovieDo(int id, Date releaseTime, int remainVotes, int boxOffice, double price, double score, int votes, String cover, String movieName) {
        this.id = id;
        this.releaseTime = releaseTime;
        this.remainVotes = remainVotes;
        this.boxOffice = boxOffice;
        this.price = price;
        this.score = score;
        this.votes = votes;
        this.cover = cover;
        this.movieName = movieName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public int getRemainVotes() {
        return remainVotes;
    }

    public void setRemainVotes(int remainVotes) {
        this.remainVotes = remainVotes;
    }

    public int getBoxOffice() {
        return boxOffice;
    }

    public void setBoxOffice(int boxOffice) {
        this.boxOffice = boxOffice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
