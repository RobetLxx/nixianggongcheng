package com.lxx.test.model;

public class bar {
    private String name;

    private Integer num;

    public bar(String name, Integer num) {
        this.name = name;
        this.num = num;
    }

    public bar() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}