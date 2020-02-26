package com.zero.shop.entity;

public class User {
    private String userName;
    private String pass;
    private String email;

    public User(String email, String pass){
        this.email = email;
        this.pass = pass;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "userName: " + userName + " email: " + email;
    }
}
