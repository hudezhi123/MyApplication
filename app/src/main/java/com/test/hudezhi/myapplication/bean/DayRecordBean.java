package com.test.hudezhi.myapplication.bean;

/**
 * created by hudezhi on 2018/5/26
 */

public class DayRecordBean implements RecordViewType {
    private String date;
    private String weekday;
    private double income;
    private double expend;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getExpend() {
        return expend;
    }

    public void setExpend(double expend) {
        this.expend = expend;
    }

    @Override
    public int getRecordViewType() {
        return RecordViewType.DAY_RECORD_VIEW;
    }
}
