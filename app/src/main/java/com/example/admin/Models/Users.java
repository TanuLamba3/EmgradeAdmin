package com.example.admin.Models;

public class Users {

    String phoneNumber, mail, password, userId, lastMessage;

    public Users(String phoneNumber, String mail, String password, String userId, String lastMessage) {
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.password = password;
        this.userId = userId;
        this.lastMessage = lastMessage;
    }

    public Users(){}

    //signup constructor
    public Users(String phoneNumber, String mail, String password) {
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.password = password;
    }

    public String getUserName() {
        return phoneNumber;
    }

    public void setUserName(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }
}
