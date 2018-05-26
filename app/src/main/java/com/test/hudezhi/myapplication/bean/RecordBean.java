package com.test.hudezhi.myapplication.bean;

/**
 * created by hudezhi on 2018/5/26
 */

public class RecordBean implements RecordViewType{

    public static final int INCOME = 1;
    public static final int EXPEND = -1;

    private String time;
    private String weekDay;
    private String date;
    private int inOrOut;  // 收入 或 支出
    private String category;  // 收入 或 支出 的种类
    private String payer;   // 付款方
    private String receiver;  // 收款方
    private String mark;   // 备注
    private double money;
    private String method;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getInOrOut() {
        return inOrOut;
    }

    public void setInOrOut(int inOrOut) {
        this.inOrOut = inOrOut;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public int getRecordViewType() {
        return RecordViewType.RECORD_VIEW;
    }
}
