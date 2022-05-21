package com.company.chapter06;

public class Dish {
    public Dish(Type type, int calorie, String name) {
        this.type = type;
        this.calorie = calorie;
        this.name = name;
    }

    private Type type;
    private int calorie;
    private String name;

    public Type getType() {
        return type;
    }

    public int getCalorie() {
        return calorie;
    }

    public String getName() {
        return name;
    }
}
