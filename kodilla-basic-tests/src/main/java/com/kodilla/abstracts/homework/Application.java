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

        Person p1 = new Person("Adam", 23, new BusDriver(2500, "don't kill persons in the bus"));
        p1.showResponsibilities();

        Person p2 = new Person("Adam", 23, new Doctor(1000, "don't kill organs"));
        p2.showResponsibilities();
    }

}
