package com.techtalkwithbeskat.dao;

public class GreetDao {

    private String message;

    public GreetDao(String name) {
        this.message = "Hello, " + name + "!";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
