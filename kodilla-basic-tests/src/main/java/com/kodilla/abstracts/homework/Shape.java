package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int a;
    private int h;

    public Shape (int a, int h) {
        this.a = a;
        this.h = h;
    }

    public int calculateArea() {
        int valueArea;
        valueArea = a * h;
        return valueArea;
    }

    public int calculateCircumference() {
        int valueCircumference;
        valueCircumference = 4 * a;
        return valueCircumference;
    }

    public abstract void giveArea();

    public abstract void giveCircumference();
}
