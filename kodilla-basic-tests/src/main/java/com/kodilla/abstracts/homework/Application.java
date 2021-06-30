package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        ShapeOne shapeOne = new ShapeOne(12, 4);
        shapeOne.giveArea();
        shapeOne.giveCircumference();

        ShapeTwo shapeTwo = new ShapeTwo(11, 14);
        shapeTwo.giveArea();
        shapeTwo.giveCircumference();

        ShapeThree shapeThree = new ShapeThree(22, 33);
        shapeThree.giveArea();
        shapeThree.giveCircumference();
    }
}
