package com.example.admin.Models;

public class MainModel {
    int image;
    String student;

    public MainModel(int image, String student) {
        this.image = image;
        this.student = student;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }
}
