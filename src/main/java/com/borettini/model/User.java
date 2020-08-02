package com.borettini.model;

public class User {
    private Long id;
    private static long counter;
    private String username;
    private String password;

    public User(String name, String password) {
        this.id = ++counter;
        this.username = name;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
