package com.techtalkwithbeskat.dao;

public class HelloDao {

    private String message;

    public HelloDao() {
        this.message = "Hello, world!";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
