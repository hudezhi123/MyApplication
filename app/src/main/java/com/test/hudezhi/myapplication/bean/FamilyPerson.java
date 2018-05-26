package com.test.hudezhi.myapplication.bean;

/**
 * created by hudezhi on 2018/5/26
 */

public class FamilyPerson {
    public static final String MALE = "男";
    public static final String FEMALE = "女";
    private int rank;
    private int order;
    private String sex;
    private String name;

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
