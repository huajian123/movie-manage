package com.hjmovie.dao.entity;

public class UserDo {
    private int id;
    private String name;
    private String password;
    private int buyMovie;
    private double balance;

    @Override
    public String toString() {
        return "UserDo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", buyMovie=" + buyMovie +
                ", balance=" + balance +
                '}';
    }

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

    public int getBuyMovie() {
        return buyMovie;
    }

    public void setBuyMovie(int buyMovie) {
        this.buyMovie = buyMovie;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public UserDo(int id, String name, String password, int buyMovie, double balance) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.buyMovie = buyMovie;
        this.balance = balance;
    }
}
