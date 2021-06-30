package com.kodilla.abstracts.homework;

public class ShapeOne extends Shape {

    public ShapeOne (int a, int h) {
        super(4, 5);
    }

    @Override
    public void giveArea() {
        System.out.println("Area of ShapeOne is:" + " " + calculateArea() );
    }

    @Override
    public void giveCircumference() {
        System.out.println("Circumference of ShapeOne is:" + " " + calculateCircumference() );
    }
}
