package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int valueArea;
    private int valueCircumference;

    public Shape (int valueArea, int valueCircumference) {
        this.valueArea = valueArea;
        this.valueCircumference = valueCircumference;
    }

    public int getValueArea() {
        return valueArea;
    }

    public int getValueCircumference() {
        return valueCircumference;
    }

    public abstract void giveArea();

    public abstract void giveCircumference();
}
