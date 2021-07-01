package com.kodilla.abstracts.homework;

public class ShapeThree extends Shape {

    public ShapeThree (int a, int h) {
        super(a, h);
    }

    @Override
    public void giveArea() {
        System.out.println("Area of ShapeThree is:" + " " + calculateArea() );
    }

    @Override
    public void giveCircumference() {
        System.out.println("Circumference of ShapeThree is:" + " " + calculateCircumference() );
    }
}