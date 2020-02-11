package com.hjmovie.dao.entity;

public class UserDo {
    private int id;
    private String name;
    private String password;
    private String buyMovie;
    private double balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBuyMovie() {
        return buyMovie;
    }

    public void setBuyMovie(String buyMovie) {
        this.buyMovie = buyMovie;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
