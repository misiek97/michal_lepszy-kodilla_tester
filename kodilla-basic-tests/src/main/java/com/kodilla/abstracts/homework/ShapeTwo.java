package com.kodilla.abstracts.homework;

public class ShapeTwo extends Shape {

    public ShapeTwo (int a, int h) {
        super(40, 50);
    }

    @Override
    public void giveArea() {
        System.out.println("Area of ShapeTwo is:" + " " + calculateArea() );
    }

    @Override
    public void giveCircumference() {
        System.out.println("Circumference of ShapeTwo is:" + " " + calculateCircumference() );
    }
}