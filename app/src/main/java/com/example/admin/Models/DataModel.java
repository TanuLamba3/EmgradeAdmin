package com.example.admin.Models;

public class DataModel {
    int View1;
    String classNum, dayNum, timeNum;

    public DataModel(int view1, String classNum, String dayNum, String timeNum) {
        View1 = view1;
        this.classNum = classNum;
        this.dayNum = dayNum;
        this.timeNum = timeNum;
    }

    public int getView1() {
        return View1;
    }

    public void setView1(int view1) {
        View1 = view1;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public String getDayNum() {
        return dayNum;
    }

    public void setDayNum(String dayNum) {
        this.dayNum = dayNum;
    }

    public String getTimeNum() {
        return timeNum;
    }

    public void setTimeNum(String timeNum) {
        this.timeNum = timeNum;
    }
}
